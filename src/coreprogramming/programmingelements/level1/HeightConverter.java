package coreprogramming.programmingelements.level1;
import java.util.Scanner;

// Program to convert height from centimeters to feet and inches
public class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double heightCm = input.nextDouble();
        // Convert cm to inches (1 inch = 2.54 cm)
        double totalInches = heightCm / 2.54;
        // Calculate feet and remaining inches
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);

        input.close();
    }
}

