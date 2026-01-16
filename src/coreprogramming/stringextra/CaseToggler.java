package coreprogramming.stringextra;
import java.util.Scanner;

/*
 * CaseToggler: Toggles the case of each character in a string, converting uppercase
 * letters to lowercase and lowercase letters to uppercase. Preserves non-alphabetic
 * characters unchanged while processing the entire string.
 */
public class CaseToggler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = "";

        // Iterate through each character and toggle its case
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c))
                result += Character.toLowerCase(c);
            else if (Character.isLowerCase(c))
                result += Character.toUpperCase(c);
            else
                result += c;  // Keep non-alphabetic characters unchanged
        }

        System.out.println(result);
    }
}
