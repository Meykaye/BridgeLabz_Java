package coreprogramming.programmingelements.level2;
import java.util.Scanner;

// Program to calculate the area of a triangle in square inches and square centimeters
public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double height = input.nextDouble();

        // Calculate area using formula: Area = 0.5 * base * height
        double areaCm2 = 0.5 * base * height;
        // Convert from cm² to in² (1 inch = 2.54 cm, so 1 in² = 2.54² cm²)
        double areaIn2 = areaCm2 / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " + areaIn2 + " and sq cm is " + areaCm2);

        input.close();
    }
}

