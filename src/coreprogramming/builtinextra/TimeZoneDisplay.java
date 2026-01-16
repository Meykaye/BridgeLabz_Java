package coreprogramming.builtinextra;
import java.time.ZoneId;
import java.time.ZonedDateTime;

// This class displays current time in different time zones
public class TimeZoneDisplay {
    public static void main(String[] args) {
        // Get current time in different time zones
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        // Display times
        System.out.println("GMT: " + gmt);
        System.out.println("IST: " + ist);
        System.out.println("PST: " + pst);
    }
}