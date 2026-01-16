package coreprogramming.builtinextra;
import java.util.Scanner;

/*
 * This class finds and displays the maximum value among three given numbers.
 * It uses Java's built-in Math.max() method to efficiently compare values.
 * This demonstrates value comparison and use of utility methods from the Math class.
 */
public class MaximumOfThree {
    // Find the maximum among three numbers using Math.max
    static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(findMax(a, b, c));
    }
}
