package coreprogramming.builtinextra;
import java.time.LocalDate;
import java.util.Scanner;

// This class performs arithmetic operations on dates (add/subtract days, months, years)
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
