package coreprogramming.stringextra;
import java.util.Scanner;

// This class reverses a string by reading characters in opposite order
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
