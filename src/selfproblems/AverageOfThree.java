package selfproblems;
import java.util.Scanner;

public class AverageOfThree {
    // Main method - Calculates the average of three numbers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read three numbers from user input
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        // Calculate average by dividing sum by 3
        double avg = (a + b + c) / 3;
        System.out.println(avg);
    }
}