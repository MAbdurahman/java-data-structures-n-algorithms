

public class BinarySearchExample {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int steps = 0;

        while (low <= high) {
            steps++;
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                System.out.println("Steps taken by binarySearch: " + steps);
                return mid;

            }else if (arr[mid] < target) {
                low = mid + 1;


            }else {
                high = mid - 1;
            }
        }
        System.out.println("Steps taken by binarySearch: " + steps);
        return -1;
    }//end of binarySearch method

    public static int recursiveBinarySearch(int[] arr, int start, int end, int target) {

        if (start > end) {
            return -1;
        }

        int mid = (start + end) / 2;
        if (arr[mid] == target) {
            return mid;

        } else if (arr[mid] < target) {//search the upper half
            return recursiveBinarySearch(arr, mid + 1, end, target);

        } else {//search the lower half
            return recursiveBinarySearch(arr, start, mid - 1, target);
        }

    }//end of recursiveBinarySearch method

    public static void main(String[] args) {
        /*int[] arrayOfNumbers = {3, 6, 12, 24, 48, 96, 192, 384};
        int target = 96; */
        int[] arrayOfNumbers = {0, 1, 1, 2, 3, 5, 8, 13, 21,34, 55, 89, 144, 233};
        int target = 233;

        int result = binarySearch(arrayOfNumbers, target);

        if (result == -1) {
            System.out.println("Element not found");

        } else {
            System.out.println("Element found at index " + result);
        }

        int[] arrayOfNumbersTwo = {3, 5, 6, 9, 11, 23, 25, 26, 27, 29, 33, 35, 36, 37, 39, 42, 45, 46, 48, 58, 62, 67, 70};
        int targetTwo = 42;

        int resulTwo = recursiveBinarySearch(arrayOfNumbersTwo, 0, arrayOfNumbersTwo.length - 1, targetTwo);

        if (resulTwo == -1) {
            System.out.println("Element not found in recursiveBinarySearch");

        } else {
            System.out.println("With recursiveBinarySearch element found at index " + resulTwo);
        }

    }//end of main method
}//end of BinarySearchExample class
