package coreprogramming.methods.level1;
import java.util.*;

/*
 * This class calculates how many complete rounds around a triangular park can be
 * completed within a fixed distance (5000m). It uses the perimeter of the triangle
 * and demonstrates geometric calculations and distance-based iterations.
 */
public class TriangularParkRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        double rounds = calculateRounds(side1, side2, side3);
        System.out.println(rounds);
        sc.close();
    }

    // Calculates number of rounds by dividing total distance by park perimeter
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter;
    }
}