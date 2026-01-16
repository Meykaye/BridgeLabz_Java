package coreprogramming.controlflows.level1;
import java.util.Scanner;

/*
 * This class calculates the sum of the first n natural numbers using a while loop
 * and verifies the result using the mathematical formula n * (n + 1) / 2.
 * This demonstrates while loop accumulation and formula verification.
 */
public class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 0) {
            int sumWhile = 0;
            int i = 1;
            while (i <= n) {
                sumWhile += i;
                i++;
            }
            int formulaSum = n * (n + 1) / 2;
            if (sumWhile == formulaSum) {
                System.out.println("Both computations are correct: " + sumWhile);
            }
        }
        scanner.close();
    }
}
