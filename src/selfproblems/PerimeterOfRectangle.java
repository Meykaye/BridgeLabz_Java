package selfproblems;
import java.util.Scanner;

public class PerimeterOfRectangle {
    // Main method - Calculates the perimeter of a rectangle using the formula: 2 * (l + w)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        // Calculate perimeter: 2 * (length + width)
        double perimeter = 2 * (length + width);
        System.out.println(perimeter);
    }
}

