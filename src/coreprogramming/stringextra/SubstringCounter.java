package coreprogramming.stringextra;
import java.util.Scanner;

/*
 * SubstringCounter: Counts the number of times a substring appears in a given string.
 * Uses sliding window technique to find all occurrences of the pattern and returns
 * the total count of matching substrings.
 */
public class SubstringCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String sub = sc.nextLine();
        int count = 0;

        // Check each position in text for substring match
        for (int i = 0; i <= text.length() - sub.length(); i++) {
            if (text.substring(i, i + sub.length()).equals(sub))
                count++;
        }

        System.out.println(count);
    }
}