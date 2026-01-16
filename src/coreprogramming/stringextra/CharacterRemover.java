package coreprogramming.stringextra;
import java.util.Scanner;

/*
 * CharacterRemover: Removes all occurrences of a specified character from a string.
 * Iterates through the string and reconstructs it by excluding the target character
 * while preserving all other characters in their original order.
 */
public class CharacterRemover {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch = sc.next().charAt(0);
        String result = "";

        // Build new string by including all characters except the one to remove
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ch)
                result += s.charAt(i);
        }

        System.out.println(result);
    }
}