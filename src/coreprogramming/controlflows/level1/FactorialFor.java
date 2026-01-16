package coreprogramming.controlflows.level1;
import java.util.Scanner;

/*
 * This class calculates the factorial of a number using a for loop.
 * Factorial is the product of all positive integers from 1 to n.
 * This demonstrates loop usage for accumulative multiplication and factorial computation.
 */
public class FactorialFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n >= 0) {
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("Factorial: " + factorial);
        }
        scanner.close();
    }
}
