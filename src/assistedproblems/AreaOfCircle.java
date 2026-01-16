package assistedproblems;
import java.util.Scanner;

public class AreaOfCircle {
    // Main method - Calculates the area of a circle using the formula: PI * r^2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        // Calculate area using Math.PI and the formula: PI * radius * radius
        double area = Math.PI * radius * radius;
        System.out.println(area);
    }
}

