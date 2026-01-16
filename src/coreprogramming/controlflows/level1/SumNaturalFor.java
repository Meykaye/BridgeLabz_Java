package coreprogramming.controlflows.level1;
import java.util.Scanner;

/*
 * This class calculates the sum of the first n natural numbers using a for loop
 * and verifies the result using the mathematical formula n * (n + 1) / 2.
 * This demonstrates loop-based accumulation and formula verification.
 */
public class SumNaturalFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 0) {
            int sumFor = 0;
            for (int i = 1; i <= n; i++) {
                sumFor += i;
            }
            int formulaSum = n * (n + 1) / 2;
            if (sumFor == formulaSum) {
                System.out.println("Both computations are correct: " + sumFor);
            }
        }
        scanner.close();
    }
}
