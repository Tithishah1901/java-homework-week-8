package homework;

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    /**
     * -Read the numbers from the console entered by the user and print the minimum
     * and maximum number the user has entered.
     * -Before the user enters the number, print the message Enter number:
     * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
     * number.
     * Hint:
     * -Use an endless while loop.
     * -Create a class with the name MinAndMaxInputChallenge.
     */

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 1;
        boolean first = true;

        while (true) {
            System.out.println("Enter number: ");
            int number = scanner.nextInt();
            if (scanner.hasNextInt()) {

                if (first) {
                    min = number;
                    max = number;
                    first = false;
                }else{
                    if (number < min) {
                        min = number;
                    }
                    if (number > max) {
                        max = number;
                    }
                }
             } else {
                    System.out.println("minimum number is "+ min);
                    System.out.println("maximum number is " + max);
                    break;
                }
            }
        }
    }
