package homework;

import java.util.Scanner;

public class PrimeNumber {
    /**
     * Write a programme to input any number and check if it is prime or not.
     * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
     * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
     * 17.... are the prime numbers.)
     */

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);

        //Input a number
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        // check if the number is prime
        if (isPrime(number)){
            System.out.println(number + " is a prime number. ");
        } else{
            System.out.println(number + " is not a prime number.");
        }
        scanner.close();
    }

    // method to check if a number is prime
    public static boolean isPrime(int num){
        if (num <=1){
            return false;
        }
        for (int i =2; i<= Math.sqrt(num); i++){
            if (num % i == 0){
                return  false;
            }
        }
        return true;
    }
}
