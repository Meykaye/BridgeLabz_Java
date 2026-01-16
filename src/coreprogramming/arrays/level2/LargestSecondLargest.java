package coreprogramming.arrays.level2;
import java.util.Scanner;

/*
 * This class finds the largest and second-largest digits in a number using
 * a fixed-size array. It extracts digits from the input number and uses sorting
 * or comparison logic to identify the top two digits by value.
 * This demonstrates digit manipulation and array-based value tracking.
 */
public class LargestSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long number = sc.nextLong();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits with a fixed array limit
        while (number != 0) {
            if (index == maxDigit) {
                break;
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
