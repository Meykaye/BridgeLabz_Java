package coreprogramming.builtinextra;
import java.util.Scanner;

// This class calculates factorial using recursion
public class RecursiveFactorial {
    // Calculate factorial recursively (base case: 0! = 1)
    static long factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
}
