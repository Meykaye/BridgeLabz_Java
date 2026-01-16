package coreprogramming.controlflows.level3;

/*
 * This class calculates the day of the week for a given date using
 * Zeller's congruence algorithm. Given month, day, and year, it determines
 * which day of the week that date falls on. This demonstrates complex
 * mathematical algorithm implementation for calendar calculations.
 */
class DayOfWeek {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        if (m < 3) {
            m += 12;
            y -= 1;
        }
        int y0 = y % 100;
        int c = y / 100;
        int dayOfWeek = (d + (13 * (m + 1)) / 5 + y0 + y0 / 4 + c / 4 + 5 * c) % 7;
        int adjustedDay = (dayOfWeek + 5) % 7;
        System.out.println(adjustedDay);
    }
}
