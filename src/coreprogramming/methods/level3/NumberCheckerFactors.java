package coreprogramming.methods.level3;
import java.util.*;

public class NumberCheckerFactors {
    static int[] factors(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) c++;
        int[] a = new int[c];
        int k = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) a[k++] = i;
        return a;
    }
    static int greatest(int[] a) {
        int m = a[0];
        for (int x : a) if (x > m) m = x;
        return m;
    }
    static int sum(int[] a) {
        int s = 0;
        for (int x : a) s += x;
        return s;
    }
    static long product(int[] a) {
        long p = 1;
        for (int x : a) p *= x;
        return p;
    }
    static double cubeProduct(int[] a) {
        double p = 1;
        for (int x : a) p *= Math.pow(x, 3);
        return p;
    }
    static boolean perfect(int n) {
        int s = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) s += i;
        return s == n;
    }
    static boolean abundant(int n) {
        int s = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) s += i;
        return s > n;
    }
    static boolean deficient(int n) {
        int s = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) s += i;
        return s < n;
    }
    static boolean strong(int n) {
        int t = n, s = 0;
        while (t > 0) {
            int d = t % 10, f = 1;
            for (int i = 1; i <= d; i++) f *= i;
            s += f;
            t /= 10;
        }
        return s == n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] f = factors(n);
        System.out.println(Arrays.toString(f));
        System.out.println(greatest(f));
        System.out.println(sum(f));
        System.out.println(product(f));
        System.out.println(cubeProduct(f));
        System.out.println(perfect(n));
        System.out.println(abundant(n));
        System.out.println(deficient(n));
        System.out.println(strong(n));
    }
}

