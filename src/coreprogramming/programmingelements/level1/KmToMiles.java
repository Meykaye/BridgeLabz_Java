package coreprogramming.programmingelements.level1;
import java.util.Scanner;

// Program to convert distance from kilometers to miles (alternative version)
public class KmToMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();

        // Convert km to miles using conversion factor
        double miles = km / 1.6;

        System.out.println("The distance " + km + " km in miles is " + miles);

        sc.close();
    }
}


