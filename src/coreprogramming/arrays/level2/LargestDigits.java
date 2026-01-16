package coreprogramming.arrays.level2;
import java.util.Scanner;

/*
 * This class finds the largest and second-largest digits within a given number.
 * It converts the number to a string, extracts individual digits, and uses dynamic
 * array resizing to store unique digits, then identifies the top two largest values.
 * This demonstrates digit extraction, array resizing, and value comparison.
 */
public class LargestDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long number = sc.nextLong();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits with dynamic array resizing if needed
        while (number != 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = temp;
            }
            digits[index] = (int)(number % 10);
            number = number / 10;
            index++;
        }

        int largest = 0;
        int secondLargest = 0;

        // Find largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }
}

