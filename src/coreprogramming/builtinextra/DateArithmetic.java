package coreprogramming.builtinextra;
import java.time.LocalDate;
import java.util.Scanner;

/*
 * This class demonstrates arithmetic operations on dates using Java's LocalDate API.
 * It allows adding or subtracting days, months, and years from a given date.
 * This teaches date manipulation using built-in Java date/time libraries.
 */
public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate date = LocalDate.parse(sc.nextLine());

        // Perform date arithmetic: add 7 days, 1 month, 2 years and subtract 3 weeks
        LocalDate result = date.plusDays(7)
                .plusMonths(1)
                .plusYears(2)
                .minusWeeks(3);

        System.out.println(result);
    }
}
