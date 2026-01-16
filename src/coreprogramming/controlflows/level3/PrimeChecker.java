package coreprogramming.controlflows.level3;
import java.util.Scanner;

/*
 * This class checks whether a given number is prime by testing divisibility
 * up to its square root. This optimized approach reduces computation time
 * compared to checking all numbers up to n. This demonstrates efficient
 * primality testing algorithms.
 */
class PrimeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
        input.close();
    }
}
