package coreprogramming.builtinextra;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * This class demonstrates various date formatting styles using DateTimeFormatter.
 * It shows how to format dates in multiple patterns such as ISO format, custom
 * patterns, and localized formats. This teaches date formatting and string conversion
 * using Java's date/time API.
 */
public class DateFormatting {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        // Define different date format patterns
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Display date in different formats
        System.out.println(today.format(f1));
        System.out.println(today.format(f2));
        System.out.println(today.format(f3));
    }
}
