package coreprogramming.arrays.level2;
import java.util.Scanner;

/*
 * This class reverses a number by extracting individual digits and displaying them
 * in reverse order. It uses array storage and mathematical operations (modulo and division)
 * to extract digits from right to left. This demonstrates number manipulation and
 * array-based digit collection.
 */
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int temp = number;
        int count = 0;

        // Count total number of digits
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];

        // Extract digits (stored in reverse order)
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Display digits to show reversed number
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
    }
}
