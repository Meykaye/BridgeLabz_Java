package coreprogramming.programmingelements.level2;
import java.util.Scanner;

// Program to perform various integer arithmetic operations with operator precedence
public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // Perform various operations following order of operations
        int op1 = a + b * c;      // Multiplication first, then addition
        int op2 = a * b + c;      // Multiplication first, then addition
        int op3 = c + a / b;      // Division first, then addition
        int op4 = a % b + c;      // Modulo first, then addition

        System.out.println("The results of Int Operations are " + op1 + ", " + op2 + ", " + op3 + ", " + op4);
        input.close();
    }
}

