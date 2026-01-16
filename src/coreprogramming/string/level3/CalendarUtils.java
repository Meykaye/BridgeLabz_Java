package coreprogramming.string.level3;
import java.util.*;

/*
 * CalendarUtils: Provides utility functions for calendar operations including
 * displaying month calendars for any given month and year. Handles leap year
 * calculations and generates properly formatted calendar grids.
 */
public class CalendarUtils {
    // Get month name from month number
    public static String getMonthName(int month){
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        return months[month-1];
    }

    // Check if year is a leap year
    public static boolean isLeapYear(int year){
        return (year%4==0 && year%100!=0) || (year%400==0);
    }

    // Get number of days in a given month, considering leap years
    public static int getDaysInMonth(int month,int year){
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if(month==2 && isLeapYear(year)) return 29;
        return days[month-1];
    }

    // Calculate the first day of month using Zeller's congruence formula
    public static int firstDay(int month,int year){
        int y0 = year - (14-month)/12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12*((14-month)/12) -2;
        int d0 = (1 + x + 31*m0/12)%7;
        return d0;
    }

    // Display calendar in standard format with proper alignment
    public static void displayCalendar(int month,int year){
        System.out.println("   "+getMonthName(month)+" "+year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int fd = firstDay(month,year);
        for(int i=0;i<fd;i++) System.out.print("    ");
        int days = getDaysInMonth(month,year);
        for(int i=1;i<=days;i++){
            System.out.printf("%3d ",i);
            if((i+fd)%7==0) System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month and year: ");
        int month = sc.nextInt();
        int year = sc.nextInt();
        displayCalendar(month,year);
    }
}
