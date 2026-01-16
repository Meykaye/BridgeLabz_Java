package coreprogramming.builtinextra;
import java.util.Scanner;

/*
 * This class calculates the factorial of a number using recursion.
 * Factorial is the product of all positive integers less than or equal to n.
 * The recursive approach demonstrates base case handling and recursive method calls.
 * This is a classic example of recursion in programming.
 */
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
