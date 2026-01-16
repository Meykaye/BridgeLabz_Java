package coreprogramming.methods.level3;
import java.util.*;

/*
 * This class checks numbers for special mathematical properties including
 * primality, perfect numbers, and other special number classifications.
 * It demonstrates special number detection and mathematical properties.
 */
public class NumberCheckerSpecial {
    static boolean prime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }
    static boolean neon(int n) {
        int s = n * n, sum = 0;
        while (s > 0) {
            sum += s % 10;
            s /= 10;
        }
        return sum == n;
    }
    static boolean spy(int n) {
        int sum = 0, prod = 1;
        while (n > 0) {
            int d = n % 10;
            sum += d;
            prod *= d;
            n /= 10;
        }
        return sum == prod;
    }
    static boolean automorphic(int n) {
        int sq = n * n;
        return String.valueOf(sq).endsWith(String.valueOf(n));
    }
    static boolean buzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(prime(n));
        System.out.println(neon(n));
        System.out.println(spy(n));
        System.out.println(automorphic(n));
        System.out.println(buzz(n));
    }
}