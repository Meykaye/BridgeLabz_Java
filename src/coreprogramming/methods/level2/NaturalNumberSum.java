package coreprogramming.methods.level2;
import java.util.*;

public class NaturalNumberSum {
    static int recursiveSum(int n) {
        if (n == 1) return 1;
        return n + recursiveSum(n - 1);
    }
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

