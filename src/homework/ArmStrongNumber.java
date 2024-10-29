package homework;

import java.util.Scanner;

public class ArmStrongNumber {
    /**
     *  Write a program to input any number and check if it Armstrong number or not
     * 153 = (1*1*1)+(5*5*5)+(3*3*3)
     * where:
     * (1*1*1)=1
     * (5*5*5)=125
     * (3*3*3)=27
     * So:
     * 1+125+27=153
     */

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int sum = 0;

        // get the number of digits
        int numberOfDigits = String.valueOf(number).length();

        // calculate the sum of the cubes of each digit
        while (number > 0){
            int digit = number % 10;
            sum += Math.pow(digit,numberOfDigits);
            number /= 10;

        }
        // check if the original number is equal to the sum
        if(originalNumber == sum){
            System.out.println(originalNumber + " is an Armstrong number. ");
        }else {
            System.out.println(originalNumber + " is not an Armstrong number. ");
        }
        scanner.close();
    }
}

