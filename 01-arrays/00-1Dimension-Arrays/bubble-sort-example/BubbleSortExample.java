

import java.util.Arrays;

public class BubbleSortExample {
    public static void bubbleSort(int[] array) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < (array.length - 1); i++) {
                if (array[i] > array[i+1]) {
                    swap(array, i, i + 1);
                    isSorted = false;

                }
            }
        }
    }//end of bubbleSort Method

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }//end of swap Method

    public static void displayArray(int[] array, String description) {
        System.out.println("Array values " + description);
        System.out.println(Arrays.toString(array));
        System.out.println();

    }//end of displayArray Method

    public static void main(String[] args) {
        int[] arrayData = {32, 8, 128, 1024, 2, 1, 4, 16, 64, 512};
        displayArray(arrayData, "before bubbleSort");
        bubbleSort(arrayData);
        displayArray(arrayData, "after bubbleSort");

    }//end of main Method
}//end of BubbleSortExample Class
