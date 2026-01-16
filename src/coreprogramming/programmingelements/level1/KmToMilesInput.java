package coreprogramming.programmingelements.level1;

import java.util.Scanner;

// Program to convert distance from kilometers to miles
public class KmToMilesInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();

        // Convert km to miles using the conversion factor (1 km = 0.625 miles)
        double miles = km / 1.6;

        System.out.println(
                "The total miles is " + miles + " mile for the given " + km + " km"
        );

        input.close();
    }
}

