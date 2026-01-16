package coreprogramming.controlflows.level3;
import java.util.Scanner;

/*
 * This class checks if a number is an abundant number.
 * An abundant number is one where the sum of its proper divisors (all divisors except
 * the number itself) exceeds the number. This demonstrates divisor calculation and
 * special number classification.
 */
class AbundantNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum > number) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }
        input.close();
    }
}
