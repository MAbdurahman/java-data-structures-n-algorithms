

import java.util.Arrays;

public class SelectionSortExample {

    public static int getIndexOfSmallest(int[] array, int startIndex) {
        int minimumValue = array[startIndex];
        int indexOfSmallest = startIndex;

        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[i] < minimumValue) {
                minimumValue = array[i];
                indexOfSmallest = i;
            }
        }

        return indexOfSmallest;

    }//end of getIndexOfSmallest Method

    public static int getIndexOfLargest(int[] array, int startIndex) {
        int maximumValue = array[startIndex];
        int indexOfLargest = startIndex;
        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[i] > maximumValue) {
                maximumValue = array[i];
                indexOfLargest = i;

            }
        }
        return indexOfLargest;

    }//end of getIndexOfLargest method
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }//end of swap Method

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = getIndexOfSmallest(array, i);
            swap(array, i, minIndex);
            /*int maxIndex = getIndexOfLargest(array, i);
            swap(array, i, maxIndex); */
        }
    }//end of selectionSort Method

    public static void displayArray(int[] array, String description) {
        System.out.println("Array values " + description);
        System.out.println(Arrays.toString(array));
        System.out.println();

    }//end of displayArray Method

    public static void main(String[] args) {
        int[] arrayData = {1024, 1, 32, 2, 16, 8, 4, 512, 64, 256, 128};

        displayArray(arrayData, "before sorting");
        selectionSort(arrayData);
        displayArray(arrayData, "after sorting");

    }//end of main Method
}//end of SelectionSortExample Class
