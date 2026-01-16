package selfproblems;
import java.util.Scanner;

public class KmToMiles {
    // Main method - Converts distance from kilometers to miles
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        // Apply conversion factor: 1 km = 0.621371 miles
        double miles = km * 0.621371;
        System.out.println(miles);
    }
}