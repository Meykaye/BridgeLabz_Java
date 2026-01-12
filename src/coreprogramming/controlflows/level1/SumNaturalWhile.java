package coreprogramming.controlflows.level1;
import java.util.Scanner;

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
