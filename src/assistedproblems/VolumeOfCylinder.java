package assistedproblems;
import java.util.Scanner;

public class VolumeOfCylinder {
    // Main method - Calculates the volume of a cylinder using the formula: PI * r^2 * h
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double height = sc.nextDouble();
        // Calculate volume using Math.PI and the formula: PI * radius * radius * height
        double volume = Math.PI * radius * radius * height;
        System.out.println(volume);
    }
}

