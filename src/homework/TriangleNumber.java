package homework;

import java.util.Scanner;

public class TriangleNumber {
    /**
     * Write a program in Java to display the pattern like a triangle with a number.
     *       For eg.
     *  Input number of rows: 10
     *  Expected Output:
     *
     *  1
     *  12
     *  123
     *  1234
     *  12345
     *  123456
     *  1234567
     *  12345678
     *  123456789
     *  12345678910
     */
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        int rows = scanner.nextInt();
        scanner.close();

        for (int i =1; i<=10; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        scanner.close();
    }

}
