package coreprogramming.controlflows.level2;
import java.util.Scanner;

/*
 * This class finds the greatest proper factor of a number (the largest factor
 * excluding the number itself) using a for loop with backward iteration.
 * This demonstrates factor identification and optimal iteration strategies.
 */
public class GreatestFactorFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int greatestFactor = 1;
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println(greatestFactor);
        scanner.close();
    }
}
