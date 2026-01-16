package coreprogramming.builtinextra;
import java.util.Scanner;

/*
 * This class generates and displays the Fibonacci series up to n terms.
 * The Fibonacci sequence is a series where each number is the sum of the two
 * preceding ones (0, 1, 1, 2, 3, 5, ...). This demonstrates iterative sequence
 * generation and mathematical computation patterns.
 */
public class FibonacciGenerator {
    // Generate Fibonacci series up to n terms
    static void printFibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFibonacci(n);
    }
}
