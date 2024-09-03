

public class LinearSearchExample {
    /**
     * linearSearch method -
     * @param arr
     * @param target
     * @return - returns an int of -1, if not found. Otherwise, returns an int of the index of element
     */
    public static int linearSearch(int[] arr, int target) {
        int steps = 0;
        for (int i = 0; i < arr.length; i++) {
            steps++;
            if (arr[i] == target) {
                System.out.println("Steps taken by linearSearch: " + steps);
                return i;
            }
        }
        System.out.println("Steps taken by linearSearch: " + steps);
        return -1;
    }//end of linearSearch method

    /**
     * recursiveLinearSearch method -
     * @param arr
     * @param firstPosition
     * @param target
     * @return - returns an int of -1, if not found. Otherwise, returns an int of the index of element
     */
    public static int recursiveLinearSearch(int[] arr, int firstPosition, int target) {

        if (firstPosition == arr.length) {
            return -1;

        } else if (arr[firstPosition] == target) {
            return firstPosition;

        } else {
            return recursiveLinearSearch(arr, firstPosition + 1, target);
        }

    }//end of recursiveLinearSearch method

    public static void main(String[] args) {
        int[] arrayOfNumbers = {0, 1, 1, 2, 3, 5, 8, 13, 21,34, 55, 89, 144, 233};
        int target = 233;

        int result = linearSearch(arrayOfNumbers, target);

        if (result == -1) {
            System.out.println("Element not found");

        } else {
            System.out.println("Element found at index: " + result);

        }

        int[] arrayOfNumbersTwo = {3, 5, 6, 9, 11, 23, 25, 26, 27, 29, 33, 35, 36, 37, 39, 42, 45, 46, 48, 58, 62, 67, 70};
        int targetTwo = 42;
        int position = 0;

        int resultTwo = recursiveLinearSearch(arrayOfNumbersTwo, position, targetTwo);

        if (resultTwo == -1) {
            System.out.println("Element not found in recursiveLinearSearch");

        } else {
            System.out.println("With recursiveLinearSearch element found at index " + resultTwo);
        }
    }//end of main method
}//end of LinearSearchExample Class

