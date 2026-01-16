package coreprogramming.methods.level1;

/*
 * This class checks whether a given month and day fall within the spring season.
 * Spring is defined as March 20 through June 20 in the Gregorian calendar.
 * It demonstrates date range checking and conditional logic for seasonal classification.
 */
public class SpringSeason {
    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        boolean isSpring = checkSpringSeason(month, day);
        if (isSpring)
            System.out.println("Its a Spring Season");
        else
            System.out.println("Not a Spring Season");
    }

    // Checks if the given month and day fall within spring season
    public static boolean checkSpringSeason(int month, int day) {
        if (month == 3 && day >= 20) return true;
        if (month == 4 || month == 5) return true;
        if (month == 6 && day <= 20) return true;
        return false;
    }
}