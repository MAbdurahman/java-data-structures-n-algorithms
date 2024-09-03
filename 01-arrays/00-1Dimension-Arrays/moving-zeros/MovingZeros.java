

import java.util.Arrays;

public class MovingZeros {

    public static void movingZeros(int[] arr) {
        int current_index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[current_index] = arr[i];
                current_index++;

            }
        }
        for (int j = current_index; j < arr.length; j++) {
            arr[j] = 0;

        }
    }//end of movingZeros Method

    public static void moveZeroes(int[] nums) {

        int i = 0;
        int j = 0;

        while(j < nums.length) {
            if(nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        while(i < nums.length) {
            nums[i++] = 0;
        }

    }

    public static void displayArray(int[] arr, String description) {
        System.out.println("Array values " + description);
        System.out.println(Arrays.toString(arr));
        System.out.println();

    }//end of displayArray Method

    public static void main(String[] args) {
        int[] triangleNumbers = {0, 1, 0, 0, 3, 0, 6, 10, 0, 15, 21, 0, 28, 0, 0, 36};

        displayArray(triangleNumbers, "before movingZeros");
        movingZeros(triangleNumbers);
        /*moveZeroes(triangleNumbers);*/
        displayArray(triangleNumbers, "after movingZeros");

    }//end of main Method
}//end of MovingZeros Class
