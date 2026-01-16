package coreprogramming.methods.level1;
import java.util.*;

/*
 * This class calculates the sum of the first n natural numbers (1 + 2 + 3 + ... + n)
 * using the mathematical formula: sum = n * (n + 1) / 2.
 * This demonstrates efficient calculation and formula-based approaches.
 */
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = findSum(n);
        System.out.println(sum);
        sc.close();
    }

    // Iterates from 1 to n and sums all numbers
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        return sum;
    }
}

