package coreprogramming.builtinextra;
import java.util.Scanner;

/*
 * This class implements a basic calculator that performs fundamental arithmetic
 * operations including addition, subtraction, multiplication, and division.
 * Each operation is implemented as a separate helper method for modularity
 * and reusability. This demonstrates method creation and arithmetic computation.
 */
public class BasicCalculator {
    // Helper method for addition
    static double add(double a, double b) { return a + b; }
    // Helper method for subtraction
    static double subtract(double a, double b) { return a - b; }
    // Helper method for multiplication
    static double multiply(double a, double b) { return a * b; }
    // Helper method for division
    static double divide(double a, double b) { return a / b; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        char op = sc.next().charAt(0);

        // Perform operation based on operator choice
        switch (op) {
            case '+': System.out.println(add(a, b)); break;
            case '-': System.out.println(subtract(a, b)); break;
            case '*': System.out.println(multiply(a, b)); break;
            case '/': System.out.println(divide(a, b)); break;
        }
    }
}
