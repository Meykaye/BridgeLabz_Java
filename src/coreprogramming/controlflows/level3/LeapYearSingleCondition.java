package coreprogramming.controlflows.level3;
import java.util.Scanner;

/*
 * This class determines if a given year is a leap year using a single
 * concise conditional expression rather than multiple if statements.
 * It demonstrates condensed logic for leap year determination.
 */
class LeapYearSingleCondition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if (year < 1582) {
            System.out.println("Year must be 1582 or later (Gregorian calendar).");
        } else {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Year is a Leap Year");
            } else {
                System.out.println("Year is not a Leap Year");
            }
        }
        input.close();
    }
}
