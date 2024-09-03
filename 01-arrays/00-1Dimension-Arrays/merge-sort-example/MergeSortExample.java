

import java.util.Arrays;

public class MergeSortExample {

    public static void mergeSort(int[] array, int low, int high) {
        if (high <= low) {
            return;
        }

        int mid = (low + high) / 2;
        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);
        merge(array, low, mid, high);

    }//end of mergeSort Method

    public static void merge(int[] array, int low, int mid, int high) {
        // Creating temporary sub-arrays
        int[] leftArray = new int[mid - low + 1];
        int[] rightArray = new int[high - mid];

        // Copying our sub-arrays into temporaries
        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = array[low + i];
        }

        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = array[mid + i + 1];
        }

        // Iterators containing current index of temp sub-arrays
        int leftIndex = 0;
        int rightIndex = 0;

        // Copying from leftArray and rightArray back into array
        for (int i = low; i < high + 1; i++) {
            // If there are still un-copied elements in R and L, copy minimum of the two
            if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
                if (leftArray[leftIndex] < rightArray[rightIndex]) {
                    array[i] = leftArray[leftIndex];
                    leftIndex++;

                } else {
                    array[i] = rightArray[rightIndex];
                    rightIndex++;

                }
            } else if (leftIndex < leftArray.length) {
                // If all elements have been copied from rightArray, copy rest of leftArray
                array[i] = leftArray[leftIndex];
                leftIndex++;

            } else if (rightIndex < rightArray.length) {
                // If all elements have been copied from leftArray, copy rest of rightArray
                array[i] = rightArray[rightIndex];
                rightIndex++;

            }
        }
    }//end of merge Method

    public static void displayArray(int[] array, String description) {
        System.out.println("Array values " + description);
        System.out.println(Arrays.toString(array));
        System.out.println();

    }//end of displayArray Method

    public static void main(String[] args) {
        int[] dataArray = {96, 3, 12, 6, 48, 24, 192};

        displayArray(dataArray, "before mergeSort");
        mergeSort(dataArray, 0, dataArray.length - 1);
        displayArray(dataArray, "after mergeSort");

    }//end of main Method
}//end of MergeSortExample Class
