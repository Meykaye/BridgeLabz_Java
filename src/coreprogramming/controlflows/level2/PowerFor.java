package coreprogramming.controlflows.level2;
import java.util.Scanner;

// Calculates the power of a number (base^exponent) using a for loop
public class PowerFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int power = scanner.nextInt();
        if (number > 0 && power >= 0) {
            long result = 1;
            for (int i = 1; i <= power; i++) {
                result *= number;
            }
            System.out.println(result);
        }
        scanner.close();
    }
}
