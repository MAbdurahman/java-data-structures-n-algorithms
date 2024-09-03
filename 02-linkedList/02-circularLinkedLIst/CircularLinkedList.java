

public class CircularLinkedList {
    Node head;
    Node tail;
    int size;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;

    }//end of Default CircularLinkedList Constructor

    public int getSize() {
        return this.size;

    }//end of getSize Method

    public Node getNodeAtIndex(int index) {
        if (index < 0 || index >= size) {
            return null;
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;

    }//end of getNodeAtIndex Method

    public void appendNode(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            newNode.next = this.head;

        } else {
            this.tail.next = newNode;
            this.tail = newNode;
            tail.next = this.head;

        }
        this.size++;

    }//end of appendNode Method

    public void appendNodeAtTail(int data) {
        Node newNode = new Node(data);

        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            this.tail.next = this.head;

        } else {
            this.tail.next = newNode;
            newNode.next = this.head;
            this.tail = newNode;

        }
        this.size++;

    }//end of appendNodeAtTail Method

    public void prependNodeAtHead(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;

        } else {
            newNode.next = this.head;
            this.head = newNode;
            this.tail.next = newNode;
        }
        this.size++;

    }//end of prependNodeAtHead Method

    public void appendNodeAtIndex(int index, int data) {
        if (index < 0 || index > size) {
            return;
        }

        if (index == 0) {
            prependNodeAtHead(data);

        } else if (index == size) {
            appendNodeAtTail(data);

        } else {
            //create the node to be inserted
            Node newNode = new Node(data);

            //get the previous node before the specified index
            Node prevNode = getNodeAtIndex(index - 1);

            //get the current node at the specified index
            Node currentNode = getNodeAtIndex(index);

            //point the prevNode next to the newNode
            prevNode.next = newNode;

            //point the newNode next to the current node at the specified index
            newNode.next = currentNode;
            size++;
        }
    }//end of appendNodeAtIndex Method

    public void deleteNodeFromHead() {
        if (this.head == null) {
            return;

        } else {
            //check if list contains only one node
            //if not, head will point to next node in the list and tail will point to the new head
            if (this.head != this.tail) {
                this.head = this.head.next;
                this.tail.next = this.head;

            } else {
                this.head = null;
                this.tail = null;
            }
            this.size--;
        }
    }//end of deleteNodeFromHead Method

    public void deleteNodeFromTail() {
        if (this.head == null) {
            return;

        } else {
            if (this.head != this.tail) {
                Node currentNode = this.head;
                //traverse through the list until the 2nd to the last node (current.next) is pointing to tail
                while (currentNode.next != this.tail) {
                    currentNode = currentNode.next;

                }
                //Second to last node will be the new tail
                this.tail = currentNode;

                //this new tail will point to the head as it is a circular linked-list
                this.tail.next = this.head;

            } else {
                //if the list contains only one node then it will remove it both head and tail will to point to null
                this.head = this.tail = null;
            }
            size--;
        }
    }//end of deleteNodeFromTail Method

    public void deleteNodeAtIndex(int index) {
        if (head == null) {
            return;
        }
        if (index < 0 || index >= size) {
            return;
        }
        if (index == 0) {
            deleteNodeFromHead();

        } else if (index == (size - 1)) {
            deleteNodeFromTail();

        } else {
            Node temp = this.head;
            //traverse the list to the specified index node
            for (int i = 0; i < index; i++) {
                temp = temp.next;

            }
            //get the previous node of the specified index node
            Node prevNode = getNodeAtIndex(index - 1);

            //assign the previous node next to the specified index node next
            prevNode.next = temp.next;

            //decrement the size
            this.size--;

        }
    }//end of deleteNodeAtIndex Method

    public void deleteCircularLinkedList() {
        if (tail != null) {
            tail.next = null;
        }
        this.head = null;
        this.tail = null;
        this.size = 0;

    }//end of deleteCircularLinkedList Method

    public void displayCircularLinkedList() {
        if (head == null) {
            System.out.println("CircularLinkedList is empty");
            head = null;
            tail = null;
            size = 0;
            return;
        }

        //print the data of head node
        System.out.print(head.data + " -> ");
        //initially current node will point to the first node
        Node current = head.next;

        while (current != head) {
            //print node and move current pointer to the next node
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        //print to simulate circling back to the head node
        System.out.println("back to head-->>" + head.data);
    }//end of displayCircularLinkedList Method

    public void traverseCircularLinkedList() {
        if (head == null) {
            System.out.println("CircularLinkedList is empty");
            head = null;
            tail = null;
            size = 0;
            return;
        }
        //initially current node will point to the first node
        Node current = head;
        do {
            //print node and move current pointer to the next node
            System.out.print(current.data + " -> ");
            current = current.next;

        } while (current != head);
        //print to simulate circling back to the head node
        System.out.println("back to head-->>" + head.data);

    }//end of traverseCircularLinkedList Method

    public int linearSearchCircularLinkedList(int target) {
        if (head == null) {
            return -1;
        }
        if (head.data == target) {
            return 0;
        }
        int index = 1;
        Node current = head.next;
        while (current != head) {
            if (current.data == target) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;

    }//end of linearSearchCircularLinkedList Method

    public int calculateLength() {
        if (head == null) {
            return 0;
        }
        Node current = head;
        int length = 0;

        do {
            current = current.next;
            length++;

        } while(current != head);

        return length;

    }//end of calculateLength Method

    protected class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }//end of Node Constructor
    }//end of Node Class
}//end of CircularLinkedList Class
