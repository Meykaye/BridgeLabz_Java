package coreprogramming.string.level2;
import java.util.Scanner;

public class VotingEligibility {

    static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++)
            ages[i] = (int)(Math.random() * 90);
        return ages;
    }

    static String[][] checkVoting(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = String.valueOf(ages[i] >= 18);
        }
        return result;
    }

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
