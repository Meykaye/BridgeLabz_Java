package coreprogramming.builtinextra;
import java.util.Scanner;

// This class calculates GCD and LCM of two numbers
public class GcdLcmCalculator {
    // Calculate GCD using Euclidean algorithm
    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // Calculate LCM using the formula: LCM = (a * b) / GCD
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("GCD: " + gcd(a, b));
        System.out.println("LCM: " + lcm(a, b));
    }
}
