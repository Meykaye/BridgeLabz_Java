package coreprogramming.string.level1;
import java.util.Scanner;

public class UpperCaseConversion {

    static String convertToUpper(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - 32);
            }
            result += c;
        }
        return result;
    }

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
        String userUpper = convertToUpper(text);
        String builtInUpper = text.toUpperCase();
        System.out.println(compareStrings(userUpper, builtInUpper));
        sc.close();
    }
}
