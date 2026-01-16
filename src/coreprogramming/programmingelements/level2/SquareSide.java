package coreprogramming.programmingelements.level2;
import java.util.Scanner;

// Program to find the side length of a square given its perimeter
public class SquareSide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double perimeter = input.nextDouble();
        // For a square: Perimeter = 4 * side, so side = perimeter / 4
        double side = perimeter / 4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        input.close();
    }
}