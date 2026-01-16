package coreprogramming.methods.level2;
import java.util.*;

// Calculates sum of first n natural numbers using both recursive and formula methods
public class NaturalNumberSum {
    // Recursively calculates sum: n + (n-1) + (n-2) + ... + 1
    static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }
    // Uses formula n*(n+1)/2 for efficient calculation
    static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) return;
        System.out.println(recursiveSum(n));
        System.out.println(formulaSum(n));
    }
}

