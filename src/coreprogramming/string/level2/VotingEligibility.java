package coreprogramming.string.level2;
import java.util.Scanner;

/*
 * VotingEligibility: Generates random ages for a set of people and determines
 * their voting eligibility based on age requirements. Displays each person's
 * age and eligibility status in a formatted table.
 */
public class VotingEligibility {

    // Generate random ages for testing
    static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++)
            ages[i] = (int)(Math.random() * 90);
        return ages;
    }

    // Check voting eligibility (age >= 18) for each person
    static String[][] checkVoting(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = String.valueOf(ages[i] >= 18);
        }
        return result;
    }

    // Display the voting data in tabular format
    static void display(String[][] data) {
        for (String[] row : data)
            System.out.println(row[0] + "\t" + row[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = generateAges(10);
        display(checkVoting(ages));
        sc.close();
    }
}
