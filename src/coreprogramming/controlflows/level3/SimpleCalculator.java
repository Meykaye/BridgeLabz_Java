package ControlFlow.Level3;
import java.util.Scanner;

class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double first = input.nextDouble();
        String op = input.next();
        double second = input.nextDouble();
        double result = 0;
        boolean validOp = true;
        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                } else {
                    System.out.println("Error: Division by zero");
                    return;
                }
                break;
            default:
                validOp = false;
                System.out.println("Invalid Operator");
        }
        if (validOp) {
            System.out.println(result);
        }
        input.close();
    }
}
