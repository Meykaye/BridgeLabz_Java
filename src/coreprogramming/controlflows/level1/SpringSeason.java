package coreprogramming.controlflows.level1;
import java.util.Scanner;

/*
 * This class determines if a given date (month and day) falls within the spring season.
 * Spring is defined as March 20 to June 20. It demonstrates complex conditional logic
 * using multiple AND/OR operators for date range checking.
 */
public class SpringSeason {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();

        boolean isSpring = (month == 3 && day >= 20) || (month == 4 || month == 5) || (month == 6 && day <= 20);
        System.out.println(isSpring ? "Its a Spring Season" : "Not a Spring Season");

        sc.close();
    }
}
