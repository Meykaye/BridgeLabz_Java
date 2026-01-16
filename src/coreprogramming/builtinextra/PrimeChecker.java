package coreprogramming.builtinextra;
import java.util.Scanner;

// This class checks whether a given number is prime or not
public class PrimeChecker {
    // Check if a number is prime by testing divisibility up to its square root
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isPrime(n) ? "Prime" : "Not Prime");
    }
}