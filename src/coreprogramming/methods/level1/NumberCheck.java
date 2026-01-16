package coreprogramming.methods.level1;
import java.util.*;

// Checks if a number is positive (1), negative (-1), or zero (0)
public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = checkNumber(number);
        System.out.println(result);
        sc.close();
    }

    // Returns 1 for positive, -1 for negative, and 0 for zero
    public static int checkNumber(int number) {
        if (number > 0) return 1;
        if (number < 0) return -1;
        return 0;
    }
}