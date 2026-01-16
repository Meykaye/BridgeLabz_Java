package coreprogramming.stringextra;
import java.util.Scanner;

/*
 * StringReverser: Reverses the order of characters in a string using both iterative
 * and recursive approaches. Demonstrates character-by-character manipulation to
 * reconstruct strings in reverse sequence.
 */
public class StringReverser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reversed = "";

        // Build reversed string by iterating from last to first character
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }

        System.out.println(reversed);
    }
}
