package net.abdurrahman.app;

public class DoublyLinkedList {
    //Instance variables
    protected Node head;
    protected Node tail;
    protected int length;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this. length = 0;

    }//end of Default DoublyLinkedList Constructor

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;

    }//end of DoublyLinkedList Constructor with one parameter

     protected class Node {
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
            next = null;
            prev = null;
        }//end of Node Constructor
    }//end of Node Class

    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }//end of printLIst Method

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nDoubly Linked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }//end of printAll Method

    public void displayList() {
        //Node current will point to head
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        /*System.out.println("Nodes of DoublyLinkedList: ");*/
        while(current != null) {
            //Prints each node by incrementing the pointer.
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }//end of displayList Method

    public void getHead() {
        System.out.println("Head: " + this.head.value);
    }//end of getHead Method

    public void getTail() {
        System.out.println("Tail: " + this.tail.value);
    }//end of getTail Method

    public void getLength() {
        System.out.println("Length: " + this.length);
    }

    public int calculateListLength() {
        Node current = head;
        int size = 0;

        while (current != null) {
            size++;
            current = current.next;
        }
        return size;

    }//end of calculatedListLength Method

    public Node getNodeAtIndex(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node temp;
        if (index < (length / 2)) {
            temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = (length - 1); i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;

    }//end of getNodeAtIndex Method


    public boolean setNodeAtIndex(int index, int value) {
        Node temp = getNodeAtIndex(index);
        if(temp != null) {
            temp.value = value;
            return true;
        }
        return false;

    }//end of setNodeAtIndex Method

    public void appendNode(int value) {
        Node newNode = new Node(value);

        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }//end of appendNode Method

    public void prependNode(int value) {
        Node newNode = new Node(value);

        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;

    }//end of prependNode Method

    public boolean insertNodeAtIndex(int index, int value) {
        if(index < 0 || index > length) {
            return false;
        }
        if(index == 0) {
            prependNode(value);
            return true;
        }
        if(index == length) {
            appendNode(value);
            return true;
        }
        Node newNode = new Node(value);
        Node before = getNodeAtIndex(index - 1);
        Node after = before.next;
        newNode.prev = before;
        newNode.next = after;
        before.next = newNode;
        after.prev = newNode;
        length++;
        return true;

    }//end of insertNodeAtIndex Method

    public Node removeFirstNode() {
        if(length == 0) {
            return null;
        }

        Node temp = head;
        if(length == 1) {
            head = null;
            tail = null;

        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;

        }
        length--;
        return temp;

    }//end of removeFirstNode Method


    public Node removeLastNode() {
        if(length == 0) {
            return null;
        }

        Node temp = tail;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }

        length--;
        return temp;

    }//end of removeLastNode Method

    public Node removeNodeAtIndex(int index) {
        if(index < 0 || index >= length) {
            return null;
        }
        if(index == 0) {
            return removeFirstNode();
        }
        if(index == length - 1) {
            return removeLastNode();
        }

        Node temp = getNodeAtIndex(index);

        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next = null;
        temp.prev = null;

        length--;
        return temp;

    }//end of removeNodeAtIndex Method
}//end of DoublyLinkedList Class
