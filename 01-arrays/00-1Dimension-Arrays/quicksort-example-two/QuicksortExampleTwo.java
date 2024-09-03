

import java.util.Arrays;

public class QuicksortExampleTwo {
    public static int partition(int[] arr, int low, int high){
        int p = low, j;

        for(j = low + 1; j <= high; j++) {
            if(arr[j] < arr[low]) {
                swap(arr, ++p, j);
            }
        }
        swap(arr, low, p);

        return p;

    }//end of partition Method

    public static void swap(int[] arr, int low, int pivot){
        int temp = arr[low];
        arr[low] = arr[pivot];
        arr[pivot] = temp;

    }//end of swap Method

    public static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }//end of quickSort Method

    public static void displayArray(int[] array, String description) {
        System.out.println("Array values " + description);
        System.out.println(Arrays.toString(array));
        System.out.println();

    }//end of displayArray Method


    public static void main(String[] args) {
        int[] dataArray = {99, 75, 67, 3, 59, 91, 83, 35, 19, 11, 27, 51, 43};
        displayArray(dataArray, "before quickSort");
        quickSort(dataArray, 0, dataArray.length - 1);
        displayArray(dataArray, "after quickSort");

    }//end of main Method
}//end of QuicksortExampleTwo Class
