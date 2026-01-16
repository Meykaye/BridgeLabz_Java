package coreprogramming.controlflows.level3;
import java.util.Scanner;

/*
 * This class checks if a number is an Armstrong number (also called narcissistic number).
 * An Armstrong number is a 3-digit number where the sum of cubes of its digits equals
 * the number itself (e.g., 153 = 1³ + 5³ + 3³). This demonstrates digit extraction and
 * special number classification.
 */
class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int originalNumber = input.nextInt();
        int number = originalNumber;
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number /= 10;
        }
        if (sum == originalNumber) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
        input.close();
    }
}
