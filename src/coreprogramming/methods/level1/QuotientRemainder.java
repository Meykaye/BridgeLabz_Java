package coreprogramming.methods.level1;
import java.util.*;

// Finds the quotient and remainder when dividing a number by a divisor
public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int divisor = sc.nextInt();
        int[] result = findRemainderAndQuotient(number, divisor);
        System.out.println(result[0]);
        System.out.println(result[1]);
        sc.close();
    }

    // Divides number by divisor and returns both quotient and remainder
    private static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }
}

