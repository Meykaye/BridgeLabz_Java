package coreprogramming.string.level2;
import java.util.Scanner;

/*
 * StringTrimmer: Compares custom string trimming implementation with Java's
 * built-in trim() method. Implements custom trim logic to remove leading and
 * trailing whitespace by finding boundary indices and extracting the substring.
 */
public class StringTrimmer {

    // Find the start and end indices of non-whitespace characters
    static int[] findTrimIndexes(String s) {
        int start = 0, end = s.length() - 1;
        while (start <= end && s.charAt(start) == ' ') start++;
        while (end >= start && s.charAt(end) == ' ') end--;
        return new int[]{start, end + 1};
    }

    // Create substring manually from start to end index
    static String substring(String s, int start, int end) {
        String r = "";
        for (int i = start; i < end; i++) r += s.charAt(i);
        return r;
    }

    // Compare two strings character by character
    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int[] idx = findTrimIndexes(text);
        String userTrim = substring(text, idx[0], idx[1]);
        String builtInTrim = text.trim();
        System.out.println(compare(userTrim, builtInTrim));
        sc.close();
    }
}