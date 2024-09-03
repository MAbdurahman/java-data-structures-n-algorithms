

import java.util.Arrays;

public class RemovingDuplicates {

    public static void displayArray(int[] arr, String description) {
        System.out.println("Array values " + description);
        System.out.println(Arrays.toString(arr));
        System.out.println();

    }//end of displayArray Method

    public static int removeDuplicates(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[count] != arr[i]) {
                count++;
                arr[count] = arr[i];
            }

        }
        return count + 1;

    }//end of removingDuplicates Method

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        displayArray(nums, "before removing duplicates");
        int new_len = removeDuplicates(nums);
        System.out.println("the array length of removed duplicates is " + new_len);
        System.out.println();
        displayArray(nums, "after removing duplicates");

    }//end of main Method
}//end of RemovingDuplicates Class
