package coreprogramming.controlflows.level3;
import java.util.Scanner;

/*
 * This class determines if a given year is a leap year using Gregorian calendar rules.
 * A leap year is divisible by 4, except for century years which must be divisible by 400.
 * This demonstrates complex conditional logic for calendar-based calculations.
 */
class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if (year < 1582) {
            System.out.println("Year must be 1582 or later (Gregorian calendar).");
        } else {
            boolean isLeap = false;
            if (year % 400 == 0) {
                isLeap = true;
            } else if (year % 100 == 0) {
                isLeap = false;
            } else if (year % 4 == 0) {
                isLeap = true;
            }
            if (isLeap) {
                System.out.println("Year is a Leap Year");
            } else {
                System.out.println("Year is not a Leap Year");
            }
        }
        input.close();
    }
}
