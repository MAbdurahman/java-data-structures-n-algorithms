
public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("\nLinked List:");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Node findMiddleNode() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }//end of findMiddleNode Method

    public boolean hasLoop() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;

    }//end of hasLoop Method

    public Node remove(int index) {
        int length = calculateLength();
        if (index < 0 || index >= length) {
            return null;
        }
        if (index == 0) {
            return removeFirst();
        }
        if (index == length - 1) {
            return removeLast();
        }
        Node prev = getNodeAt(index - 1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;

    }//end of remove Method
    public Node removeLast() {
        int length = calculateLength();
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;
        while(temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public Node removeFirst() {
        int length = calculateLength();
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    public Node findKthFromEnd(int k) {
        Node slow = head;
        Node fast = head;

        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return null;
            }
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }//end of findKthFromEnd Method

    public void partitionList(int x) {

        if (head == null) {
            return;
        }

        Node left = new Node(0);
        Node right = new Node(0);
        Node leftTail = left;
        Node rightTail = right;
        Node current = head;

        while (current != null) {
            if (current.value < x) {
                leftTail.next = current;
                leftTail = current;

            } else {
                rightTail.next = current;
                rightTail = current;

            }
            current = current.next;
        }

        leftTail.next = right.next;
        rightTail.next = null;

        head = left.next;

    }//end of partitionList Method


    public void displayLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println();
    }//end of displayLinkedList Method

    public int calculateLength() {
        Node temp = head;
        int length = 0;
        while (temp != null) {
            temp = temp.next;
            length++;
        }
        return length;

    }//end of calculateLength Method

    public void removeDuplicates() {
        Node current = head;
        Node index = null;
        Node temp = null;

        if (current == null) {
            return;

        } else {
            while (current != null) {
                temp = current;
                index = current.next;
                while (index != null) {

                    if (current.value == index.value) {
                        temp.next = index.next;

                    } else {
                        temp = index;

                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }//end of removeDuplicates Method

    public void reverseList() {
        Node previousNode = null;
        Node nextNode = null;
        Node currentNode = head;

        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;

        }
        head = previousNode;

    }//end of reverseList Method

    public void reverseBetween(int startIndex, int endIndex) {
        if (head == null) {
            return;
        }

        Node dummyNode = new Node(0);
        dummyNode.next = head;
        Node previousNode = dummyNode;

        for (int i = 0; i < startIndex; i++) {
            previousNode = previousNode.next;
        }

        Node currentNode = previousNode.next;

        for (int i = 0; i < (endIndex - startIndex); i++) {
            Node nodeToMove = currentNode.next;
            currentNode.next = nodeToMove.next;
            nodeToMove.next = previousNode.next;
            previousNode.next = nodeToMove;
        }

        head = dummyNode.next;
    }//end of reverseBetween Method

    public int binaryToDecimal() {
        int decimal = 0;

        while (head != null) {
            decimal  = (decimal <<= 1) + (head.value == 1 ? 1 : 0);
            head = head.next;
        }

        return decimal;

    }//end of binaryToDecimal Method

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;

        for (int i = 0; i < calculateLength(); i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }

    }//end of reverse Method

    protected Node getNodeAt(int index) {
        if (index < 0 || index >= calculateLength()) {
            return null;
        }
        Node temp = this.head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;

    }//end of getNodeAt Method



    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }//end of Node Class

}//end of LinkedList Class
