package coreprogramming.string.level1;
import java.util.Scanner;

// Program to compare custom substring implementation with built-in substring method
public class SubstringCreation {

    // Create a substring manually by iterating through characters from start to end index
    static String createSubstring(String s, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += s.charAt(i);
        }
        return result;
    }

    // Compare two strings character by character
    static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String userSub = createSubstring(text, start, end);
        String builtInSub = text.substring(start, end);
        System.out.println(compareStrings(userSub, builtInSub));
        sc.close();
    }
}