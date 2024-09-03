

public class Main {

    public static void displayCircularLinkedListSize(CircularLinkedList list) {
        int result = list.getSize();
        System.out.println("This CircularLinkedList size is: " + result);
        System.out.println();
    }//end of displayCircularLinkedListSize Method

    public static void displayCalculateLength(CircularLinkedList list) {
        int result = list.calculateLength();
        System.out.println("This CircularLinkedList calculateLength is: " + result);
        System.out.println();

    }//end of displayCalculatedLength Method
    public static void displayGetNodeAtIndex(CircularLinkedList list, int index) {
        CircularLinkedList.Node node = list.getNodeAtIndex(index);;
        System.out.println("Node at index "+index+" is "+node.data);
        System.out.println();

    }//end of displayGetNodeAtIndex Method

    public static void displayLinearSearchCircularLinkedList(CircularLinkedList list, int target) {
        int result = list.linearSearchCircularLinkedList(target);

        if(result == -1) {
            System.out.println("Element with value of "+target+" not found!");

        } else {
            System.out.println("Element with value of "+target+" found at index "+result);
        }

    }//end of displayLinearSearchCircularLinkedList Method

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.displayCircularLinkedList();
        displayCircularLinkedListSize(list);


        list.appendNode(5);
        list.displayCircularLinkedList();
        displayCircularLinkedListSize(list);

        list.appendNode(6);
        list.displayCircularLinkedList();
        displayCircularLinkedListSize(list);

        list.appendNode(7);
        list.displayCircularLinkedList();
        displayCircularLinkedListSize(list);

        list.appendNode(8);
        list.displayCircularLinkedList();
        displayCircularLinkedListSize(list);

        System.out.println("delete node at index 0");
        list.deleteNodeAtIndex(0);
        list.displayCircularLinkedList();
        displayCircularLinkedListSize(list);

        System.out.println("delete node at index 99");
        list.deleteNodeAtIndex(99);
        list.displayCircularLinkedList();
        displayCircularLinkedListSize(list);

        System.out.println("delete node at index 1");
        list.deleteNodeAtIndex(1);
        list.displayCircularLinkedList();
        displayCircularLinkedListSize(list);

        System.out.println("delete node at index 1 again");
        list.deleteNodeAtIndex(1);
        list.displayCircularLinkedList();
        displayCircularLinkedListSize(list);

        System.out.println("delete node at index 0");
        list.deleteNodeAtIndex(0);
        list.displayCircularLinkedList();
        displayCircularLinkedListSize(list);

        System.out.println("add new data to the circular linked list. . .");
        list.appendNode(1);
        list.displayCircularLinkedList();
        displayCircularLinkedListSize(list);

        list.appendNode(2);
        list.displayCircularLinkedList();
        displayCircularLinkedListSize(list);

        list.appendNode(3);
        list.displayCircularLinkedList();
        displayCircularLinkedListSize(list);

        list.appendNode(4);
        list.displayCircularLinkedList();
        displayCircularLinkedListSize(list);

        list.appendNode(5);
        list.displayCircularLinkedList();
        displayCircularLinkedListSize(list);

        System.out.println("delete entire circular linked list");
        list.deleteCircularLinkedList();
        list.displayCircularLinkedList();
        displayCircularLinkedListSize(list);


    }//end of main Method
}//end of Main Class
