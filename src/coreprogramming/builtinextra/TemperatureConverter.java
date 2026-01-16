package coreprogramming.builtinextra;
import java.util.Scanner;

/*
 * This class converts temperatures between Celsius and Fahrenheit scales.
 * It implements the mathematical formulas: C to F: (C * 9/5) + 32 and
 * F to C: (F - 32) * 5/9. This demonstrates temperature conversion logic
 * and practical use of mathematical formulas in programming.
 */
public class TemperatureConverter {
    // Convert Celsius to Fahrenheit using formula: (C * 9/5) + 32
    static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    // Convert Fahrenheit to Celsius using formula: (F - 32) * 5/9
    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        double temp = sc.nextDouble();

        // Convert based on user choice (1 for C to F, else F to C)
        if (choice == 1)
            System.out.println(celsiusToFahrenheit(temp));
        else
            System.out.println(fahrenheitToCelsius(temp));
    }
}
