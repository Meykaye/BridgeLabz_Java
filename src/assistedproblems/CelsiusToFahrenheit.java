package assistedproblems;
import java.util.Scanner;

public class CelsiusToFahrenheit {
    // Main method - Converts temperature from Celsius to Fahrenheit
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = sc.nextDouble();
        // Apply conversion formula: (C * 9/5) + 32 = F
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(fahrenheit);
    }
}

