package coreprogramming.controlflows.level3;
import java.util.Scanner;

/*
 * This class checks if a number is a Harshad number (also called Niven number).
 * A Harshad number is divisible by the sum of its digits. For example, 12 is a
 * Harshad number because 12 is divisible by (1+2=3). This demonstrates special
 * number classification.
 */
class HarshadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int original = number;
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        if (sum != 0 && original % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }
        input.close();
    }
}
