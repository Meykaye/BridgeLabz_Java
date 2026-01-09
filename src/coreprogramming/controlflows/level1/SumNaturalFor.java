package ControlFlow.Level1;
import java.util.Scanner;

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
