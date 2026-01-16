package coreprogramming.arrays.level2;
import java.util.Scanner;

// This class counts the frequency of each digit in a number
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long number = sc.nextLong();
        long temp = number;
        int count = 0;

        // Count total number of digits
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        int[] frequency = new int[10];  // Store frequency for digits 0-9

        // Extract digits in reverse order
        for (int i = 0; i < count; i++) {
            digits[i] = (int)(number % 10);
            number /= 10;
        }

        // Count frequency of each digit
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // Display digits that appear at least once
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0)
                System.out.println(i + " : " + frequency[i]);
        }
    }
}
