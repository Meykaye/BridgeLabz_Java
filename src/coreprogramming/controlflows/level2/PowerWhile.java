package coreprogramming.controlflows.level2;
import java.util.Scanner;

/*
 * This class calculates the power (exponentiation) of a base number raised to
 * an exponent using a while loop with accumulated multiplication.
 * This demonstrates iterative computation using while loop iteration.
 */
public class PowerWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int power = scanner.nextInt();
        if (number > 0 && power >= 0) {
            long result = 1;
            int counter = 0;
            while (counter < power) {
                result *= number;
                counter++;
            }
            System.out.println(result);
        }
        scanner.close();
    }
}
