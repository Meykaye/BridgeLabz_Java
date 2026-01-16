package coreprogramming.string.level1;
import java.util.Scanner;

// Program to compare custom lowercase conversion with built-in toLowerCase method
public class LowerCaseConversion {

    // Convert each uppercase letter to lowercase by adding 32 to ASCII value
    static String convertToLower(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 32);
            }
            result += c;
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
        String text = sc.nextLine();
        String userLower = convertToLower(text);
        String builtInLower = text.toLowerCase();
        System.out.println(compareStrings(userLower, builtInLower));
        sc.close();
    }
}
