package coreprogramming.programmingelements.level2;
import java.util.Scanner;

// Program to find quotient and remainder when dividing two numbers
public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        // Calculate quotient using integer division and remainder using modulo operator
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two number " + number1 + " and " + number2);
        input.close();
    }
}

