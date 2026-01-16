package coreprogramming.programmingelements.level2;
import java.util.Scanner;

// Program to perform various double-precision floating-point arithmetic operations
public class DoubleOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Perform various operations with floating-point numbers
        double op1 = a + b * c;    // Multiplication first, then addition
        double op2 = a * b + c;    // Multiplication first, then addition
        double op3 = c + a / b;    // Division first, then addition
        double op4 = a % b + c;    // Modulo first, then addition

        System.out.println("The results of Double Operations are " + op1 + ", " + op2 + ", " + op3 + ", " + op4);
        input.close();
    }
}

