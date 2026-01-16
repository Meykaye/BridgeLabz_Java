package coreprogramming.stringextra;
import java.util.Scanner;

/*
 * DuplicateRemover: Eliminates all duplicate characters from a string, keeping only
 * the first occurrence of each character. Uses character comparison to identify and
 * filter out redundant characters while maintaining original sequence.
 */
public class DuplicateRemover {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = "";

        // Add character to result only if it hasn't appeared before
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (result.indexOf(c) == -1)  // Character not found in result yet
                result += c;
        }

        System.out.println(result);
    }
}
