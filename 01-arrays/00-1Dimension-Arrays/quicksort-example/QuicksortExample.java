

import java.util.Arrays;

public class QuicksortExample {
    private static int partition(int[] array, int low, int high) {

        // choose the rightmost element as pivot
        int pivot = array[high];

        // pointer for greater element
        int i = (low - 1);

        // traverse through all elements
        // compare each element with pivot
        for (int j = low; j < high; j++) {
            /*
              To sort the elements in descending order, change the less than sign to
              greater than (i.e., 'if (array[j] >= pivot)')
             */
            if (array[j] <= pivot) {

                // if element smaller than pivot is found
                // swap it with the greater element pointed by i
                i++;

                // swapping element at i with element at j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }

        // swap the pivot element with the greater element specified by i
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // return the position from where partition is done
        return (i + 1);

    }//end of partition Method

    public static void displayArray(int[] array, String description) {
        System.out.println("Array values " + description);
        System.out.println(Arrays.toString(array));
        System.out.println();

    }//end of displayArray Method

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {

            // find pivot element such that
            // elements smaller than pivot are on the left
            // elements greater than pivot are on the right
            int pivot = partition(array, low, high);

            // recursive call on the left of pivot
            quickSort(array, low, pivot - 1);

            // recursive call on the right of pivot
            quickSort(array, pivot + 1, high);
        }
    }//end of quickSort Method

    public static void main(String[] args) {

        int[] arrayData = { 192, 3, 96, 6, 768, 384, 48, 24, 12, };
        int size = arrayData.length;

        displayArray(arrayData, "before quickSort");
        quickSort(arrayData, 0, size - 1);
        displayArray(arrayData, "after quickSort");

    }//end of main Method
}//end of QuicksortExample Class
