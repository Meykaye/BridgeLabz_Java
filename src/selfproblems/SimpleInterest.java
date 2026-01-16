package selfproblems;
import java.util.Scanner;

public class SimpleInterest {
    // Main method - Calculates simple interest using the formula: (P * R * T) / 100
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read principal (p), rate (r), and time (t) from user input
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        // Calculate simple interest: (Principal * Rate * Time) / 100
        double si = (p * r * t) / 100;
        System.out.println(si);
    }
}