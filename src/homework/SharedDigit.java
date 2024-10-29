package homework;

public class SharedDigit {
    /**
     *  Shared Digit
     * Write a method named hasSharedDigit with two parameters of type int.
     * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
     * within the range, the method should return false.
     * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
     * otherwise, the method should return false.
     * EXAMPLE INPUT/OUTPUT:
     * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
     * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
     * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
     * NOTE: The method hasSharedDigit should be defined as public static
     */

    public static boolean hasSharedDigit(int num1, int num2){
        // check if numbers are within the range of 10 99
        if(num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99){
            return false;
        }
        // extract digits from both number
        int num1FirstDigit = num1/10;
        int num1SecondDigit = num1 % 10;
        int num2FirstDigit = num2 / 10;
        int num2SecondDigit = num2 % 10;

        // check for any shared digits between num1 and num2
        return (num1FirstDigit == num2FirstDigit|| num1FirstDigit == num2SecondDigit ||
                num1SecondDigit == num2FirstDigit|| num1SecondDigit == num2SecondDigit);
    }

    //Declare main method
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
        System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(15,55));
    }

}
