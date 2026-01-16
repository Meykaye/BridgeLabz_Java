package coreprogramming.methods.level2;
import java.util.*;

// Analyzes factors of a number: finds all factors, sum, product, and sum of squares
public class FactorsProgram {
    // Finds all factors of n and returns them in an array
    static int[] findFactors(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) c++;
        int[] a = new int[c];
        int k = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) a[k++] = i;
        return a;
    }
    // Calculates sum of all numbers in array
    static int sum(int[] a) {
        int s = 0;
        for (int x : a) s += x;
        return s;
    }
    // Calculates product of all numbers in array
    static int product(int[] a) {
        int p = 1;
        for (int x : a) p *= x;
        return p;
    // Calculates sum of squares of all elements in array
    }
    static double sumSquares(int[] a) {
        double s = 0;
        for (int x : a) s += Math.pow(x, 2);
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] f = findFactors(n);
        System.out.println(Arrays.toString(f));
        System.out.println(sum(f));
        System.out.println(product(f));
        System.out.println(sumSquares(f));
    }
}

