package coreprogramming.controlflows.level1;
import java.util.Scanner;

// Calculates the factorial of a number using a while loop
public class FactorialWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n >= 0) {
            long factorial = 1;
            int i = 1;
            while (i <= n) {
                factorial *= i;
                i++;
            }
            System.out.println("Factorial: " + factorial);
        }
        scanner.close();
    }
}
