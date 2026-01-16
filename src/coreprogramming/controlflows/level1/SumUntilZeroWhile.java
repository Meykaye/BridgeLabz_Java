package coreprogramming.controlflows.level1;
import java.util.Scanner;

/*
 * This class accumulates the sum of positive numbers entered by the user until
 * a non-positive value is entered. It uses a while loop with conditional break.
 * This demonstrates bounded input validation and accumulation patterns.
 */
public class SumUntilZeroWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int num = scanner.nextInt();
            if (num <= 0) {
                break;
            }
            sum += num;
        }
        System.out.println("Sum until non-positive number: " + sum);
        scanner.close();
    }
}