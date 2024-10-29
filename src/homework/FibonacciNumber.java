package homework;

public class FibonacciNumber {
    /**
     * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
     */
    public static void main(String[] args) {
        int n = 8;
        int firstTerm = 1, secondTerm = 1;

        System.out.print(firstTerm + " " + secondTerm);

        for (int i = 3; i <= n; i++){
            int nextTerm = firstTerm + secondTerm;
            System.out.print(" " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }
    }
}
