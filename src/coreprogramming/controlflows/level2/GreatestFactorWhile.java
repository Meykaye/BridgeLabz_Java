package coreprogramming.controlflows.level2;
import java.util.Scanner;

/*
 * This class finds the greatest proper factor of a number (the largest factor
 * excluding the number itself) using a while loop with backward iteration.
 * This demonstrates factor identification using while loop based iteration.
 */
public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int greatestFactor = 1;
        int counter = number - 1;
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }
        System.out.println(greatestFactor);
        scanner.close();
    }
}