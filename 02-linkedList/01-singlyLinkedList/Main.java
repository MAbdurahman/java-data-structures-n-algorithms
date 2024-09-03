

public class Main {

    public static void displayGetNodeAtIndex(LinkedList list, int index) {
        LinkedList.Node node = list.getNodeAt(index);;
        System.out.println("Node value at index "+index+" is "+node.value);
        System.out.println();

    }//end of displayGetNodeAtIndex Method

    public static void displaySinglyLinkedList(LinkedList list, String description) {
        System.out.println("SinglyLinkedList values: " + description);
        list.displayLinkedList();
        System.out.println();

    }//end of displaySinglyLinkedList Method

    public static void main(String[] args) {
        // Create a linked list with values 64, 49, 36, 25, 16, 9, 4, 1
        LinkedList myLinkedList = new LinkedList(64);
        myLinkedList.append(49);
        myLinkedList.append(36);
        myLinkedList.append(25);
        myLinkedList.append(16);
        myLinkedList.append(9);
        myLinkedList.append(4);
        myLinkedList.append(1);

        displaySinglyLinkedList(myLinkedList, "original");
        displaySinglyLinkedList(myLinkedList, "before reverse");
        myLinkedList.reverseList();
        displaySinglyLinkedList(myLinkedList, "after reverse");

        System.out.println("Find the nth node from the end");
        displaySinglyLinkedList(myLinkedList, "current SinglyLinkedList");
        int nodeFromEnd = 5;
        LinkedList.Node kthFromEnd = myLinkedList.findKthFromEnd(nodeFromEnd);
        System.out.println(nodeFromEnd+" node from the end value is: " + kthFromEnd.value);

        displaySinglyLinkedList(myLinkedList, "current SinglyLinkedList");
        displayGetNodeAtIndex(myLinkedList, nodeFromEnd);

    }//end of main Method
}//end of Main Class
