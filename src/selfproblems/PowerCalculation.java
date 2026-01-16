package selfproblems;
import java.util.Scanner;

public class PowerCalculation {
    // Main method - Calculates the power of a number (base^exponent)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read base and exponent from user input
        double base = sc.nextDouble();
        double exponent = sc.nextDouble();
        // Calculate and print base raised to the power of exponent using Math.pow()
        System.out.println(Math.pow(base, exponent));
    }
}

