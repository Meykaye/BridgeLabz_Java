package coreprogramming.string.level1;
import java.util.Scanner;

/*
 * This class converts a string to a character array both manually and using
 * built-in methods, then compares the results to verify correctness.
 * It demonstrates string-to-character conversion techniques.
 */
public class CharacterArrayComparison {

    // Convert string to character array manually
    static char[] getCharacters(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }

    // Compare two character arrays for equality
    static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        char[] userArray = getCharacters(text);
        char[] builtInArray = text.toCharArray();
        // Compare manually created array with built-in toCharArray()
        System.out.println(compareArrays(userArray, builtInArray));
        sc.close();
    }
}

