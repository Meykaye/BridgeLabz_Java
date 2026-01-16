package coreprogramming.builtinextra;
import java.time.LocalDate;
import java.util.Scanner;

/*
 * This class compares two dates and determines their chronological order.
 * It uses LocalDate's comparison methods to establish whether dates are before,
 * after, or equal to each other. This demonstrates date comparison techniques
 * using Java's modern date/time API.
 */
public class DateComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate date1 = LocalDate.parse(sc.nextLine());
        LocalDate date2 = LocalDate.parse(sc.nextLine());

        // Compare dates and display appropriate message
        if (date1.isBefore(date2))
            System.out.println("First date is before second date");
        else if (date1.isAfter(date2))
            System.out.println("First date is after second date");
        else
            System.out.println("Both dates are the same");
    }
}
