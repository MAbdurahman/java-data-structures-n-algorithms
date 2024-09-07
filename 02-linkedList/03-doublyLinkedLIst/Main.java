package net.abdurrahman.app;

public class Main {

    public static void displayDoublyLinkedList(DoublyLinkedList list, String description) {
        System.out.println("DoublyLinkedList values: " + description);
        list.displayList();
        System.out.println();
    }//end of displayDoublyLinkedList Method

    public static void displayNodeAtIndex(DoublyLinkedList list, int index, String description) {
        System.out.println("Node at index " + index + ": " + description);
        DoublyLinkedList.Node node = list.getNodeAtIndex(index);
        System.out.println("Node value at index " + index + " is " + node.value);
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList ddList = new DoublyLinkedList();
        ddList.appendNode(7);
        ddList.getHead();
        ddList.getTail();
        ddList.getLength();
        ddList.displayList();
        ddList.appendNode(49);
        ddList.displayList();
        ddList.getLength();
        ddList.appendNode(343);
        ddList.displayList();
        ddList.getHead();
        ddList.getTail();
        ddList.getLength();
        displayDoublyLinkedList(ddList, "before removeLastNode");
        ddList.removeLastNode();
        displayDoublyLinkedList(ddList, "after removeLastNode");
        displayDoublyLinkedList(ddList, "before removeFirstNode");
        ddList.removeLastNode();
        ddList.removeLastNode();
        ddList.removeLastNode();
        displayDoublyLinkedList(ddList, "after removeLastNode");
        ddList.appendNode(3);
        ddList.appendNode(5);
        ddList.appendNode(7);
        ddList.appendNode(11);
        ddList.appendNode(13);
        displayDoublyLinkedList(ddList, "after appendNode");
        displayDoublyLinkedList(ddList, "before prependNode");
        ddList.prependNode(2);
        displayDoublyLinkedList(ddList, "after prependNode");
        int length = ddList.calculateListLength();
        System.out.println("calculated DoublyLinkedList length is " + length);
        displayDoublyLinkedList(ddList, "before removeFirstNode");
        ddList.removeFirstNode();
        displayDoublyLinkedList(ddList, "after removeFirstNode");
        displayNodeAtIndex(ddList, 3, "with getNodeAtIndex Method");
        displayDoublyLinkedList(ddList, "before setNodeAtIndex Method");
        ddList.setNodeAtIndex(3, 9);
        displayDoublyLinkedList(ddList, "after setNodeAtIndex Method");
        displayDoublyLinkedList(ddList, "before setNodeAtIndex Method");
        ddList.setNodeAtIndex(3, 11);
        displayDoublyLinkedList(ddList, "after setNodeAtIndex Method");
        ddList.appendNode(37);
        displayDoublyLinkedList(ddList, "after appendNode");
        displayDoublyLinkedList(ddList, "before insertNodeAtIndex Method");
        ddList.insertNodeAtIndex(5, 17);
        displayDoublyLinkedList(ddList, "after insertNodeAtIndex Method");
        ddList.insertNodeAtIndex(7, 31);
        displayDoublyLinkedList(ddList, "after insertNodeAtIndex Method");
        ddList.setNodeAtIndex(6, 31);
        displayDoublyLinkedList(ddList, "after setNodeAtIndex Method");
        ddList.setNodeAtIndex(7, 37);
        displayDoublyLinkedList(ddList, "after setNodeAtIndex Method");
        ddList.appendNode(71);
        ddList.appendNode(73);
        ddList.appendNode(79);
        ddList.appendNode(97);
        displayDoublyLinkedList(ddList, "after appendNode");
        displayDoublyLinkedList(ddList, "before removeNodeAtIndex Method");
        ddList.removeNodeAtIndex(2);
        displayDoublyLinkedList(ddList, "after removeNodeAtIndex Method");
        displayDoublyLinkedList(ddList, "before removeNodeAtIndex Method");
        ddList.removeNodeAtIndex(9);
        displayDoublyLinkedList(ddList, "after removeNodeAtIndex Method");

    }//end of main Method
}//end of Main Class
