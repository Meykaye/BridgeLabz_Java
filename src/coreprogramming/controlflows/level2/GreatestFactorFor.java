package coreprogramming.controlflows.level2;
import java.util.Scanner;

// Finds the greatest factor of a number (excluding the number itself) using a for loop
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
