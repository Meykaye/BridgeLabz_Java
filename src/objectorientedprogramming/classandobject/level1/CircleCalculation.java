package objectorientedprogramming.classandobject.level1;
import java.util.Scanner;

/**
 * Circle class calculates area and circumference of a circle
 */
class Circle {
    double radius;  // Radius of the circle

    /**
     * Calculates the area of the circle
     */
    double area() {
        return Math.PI * radius * radius;
    }

    /**
     * Calculates the circumference of the circle
     */
    double circumference() {
        return 2 * Math.PI * radius;
    }

    /**
     * Displays both area and circumference to the console
     */
    void displayResult() {
        System.out.println(area());
        System.out.println(circumference());
    }
}

public class CircleCalculation {
    /**
     * Main method to demonstrate Circle class functionality
     * Takes radius as input and calculates area and circumference
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();

        // Read radius from user
        c.radius = sc.nextDouble();
        
        // Calculate and display area and circumference
        c.displayResult();
        sc.close();
    }
}
