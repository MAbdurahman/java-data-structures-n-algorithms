

import java.util.Arrays;

public class InsertionSortExample {
    public static void insertionSort(int[] array) {
        for (int j = 1; j < array.length; j++) {
            int current = array[j];
            int i = j-1;
            while ((i > -1) && (array[i] > current)) {
                array[i+1] = array[i];
                i--;
            }
            array[i+1] = current;
        }
    }//end of insertionSort Method

    public static void displayArray(int[] array, String description) {
        System.out.println("Array values " + description);
        System.out.println(Arrays.toString(array));
        System.out.println();

    }//end of displayArray Method

    public static void main(String[] args) {
        int[] arr = new int[]{144, 121, 1, 4, 9, 100, 36, 25, 81, 64, 49, 16};

        displayArray(arr, "before insertionSort");
        insertionSort(arr);
        displayArray(arr, "after insertionSort");

    }//end of main Method
}//end of InsertionSortExample Class
