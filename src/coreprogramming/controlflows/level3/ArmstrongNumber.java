package coreprogramming.controlflows.level3;
import java.util.Scanner;

// Checks if a number is an Armstrong number (sum of cubes of digits equals the number)
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
