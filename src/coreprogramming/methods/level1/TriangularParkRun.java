package coreprogramming.methods.level1;
import java.util.*;

// Calculates how many complete rounds can be run in a 5000m distance around a triangular park
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