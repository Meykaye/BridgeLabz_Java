package coreprogramming.methods.level2;
import java.util.*;

// Determines if a given year is a leap year following Gregorian calendar rules
public class LeapYear {
    // Leap year if divisible by 4, except century years unless divisible by 400
    static boolean isLeap(int y) {
        if (y < 1582) return false;
        return (y % 4 == 0 && y % 100 != 0) || y % 400 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        System.out.println(isLeap(y));
    }
}
