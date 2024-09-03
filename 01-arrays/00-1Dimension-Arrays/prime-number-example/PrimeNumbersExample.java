

import java.util.Scanner;

public class PrimeNumbersExample {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String answer = "";
        int firstNumber;
        int firstNumber2;
        int secondNumber;

        System.out.println();
        System.out.println("This application finds the number of primes between the first number");
        System.out.println("entered and the second number entered.");
        System.out.println();
        do {
            do {
                System.out.print("Enter the first number: ");
                firstNumber = keyboard.nextInt();
                firstNumber2 = firstNumber;
                System.out.println("The first number is "+ firstNumber2);
                System.out.print("Enter the second number: ");
                secondNumber = keyboard.nextInt();
                System.out.println("The first number is "+ secondNumber);

                if (firstNumber > secondNumber) {
                    System.out.println("The first number entered is greater than the second number!");
                }
            } while (firstNumber > secondNumber);

            /* the while loop finds and displays all the prime numbers between firstNumber and secondNumber, by
    			 calling isPrime on each firstNumber*/
            int count = 0;
            while (firstNumber < secondNumber) {
                if (isPrime(firstNumber)) {
                    System.out.println(firstNumber);
                    count++;
                }
                firstNumber++;
            }//end of while loop
            System.out.println();
            System.out.println("The number of primes between " + firstNumber2
                    + " and " + secondNumber + " is " +count);
            System.out.println();
            do {
                System.out.println("Repeat? y - Yes or n - No ");
                answer = keyboard.next();
                if (answer.equalsIgnoreCase("Y")) {
                    System.out.println();

                } else if (answer.equalsIgnoreCase("N")) {
                    System.out.println();
                    System.out.println("Good-bye...");
                    System.exit(0);
                } else {
                    System.out.println("Please enter (y for Yes) or (n for No)");
                }
            } while (!answer.equalsIgnoreCase("Y"));
        } while (answer.equalsIgnoreCase("Y"));
    }//end of the main Method

    /**
     * isPrime Method - Determines whether a number is prime
     * @param aNumber - int represents a number
     * @return Boolean - Returns true if number is prime, otherwise false.
     */
    public static boolean isPrime(int aNumber) {
        if (aNumber < 2) {// 2 is the smallest prime number
            return false;

        } else if (aNumber == 2) {// special case: 2 is the only even prime
            return true;

        } else if (aNumber % 2 == 0) {// no even number besides 2 is prime
            return false;

        } else {// test all possible odd divisors of number
            boolean divisorFound = false;
            int i = 3;  // i represents the current divisor that is being considered
            while (i < aNumber) {
                if (aNumber % i == 0) {// if number is divisible by i...
                    divisorFound = true;
                    break;  //exit the while loop
                }
                i += 2;
            }

            //if a divisor HAS been found, the number IS NOT prime
            //if a divisor HAS NOT been found, the number IS prime
            return !divisorFound;
        }
    }//end of the isPrime Method

}//end of PrimeNumbersExample Class
