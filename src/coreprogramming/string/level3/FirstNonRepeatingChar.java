package coreprogramming.string.level3;
import java.util.Scanner;

// Program to find the first non-repeating character in a string
public class FirstNonRepeatingChar {
    // Find and return the first character that appears only once
    public static char firstNonRepeating(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) freq[text.charAt(i)]++;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) return text.charAt(i);
        }
        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        char res = firstNonRepeating(text);
        if (res == '\0') System.out.println("No non-repeating character");
        else System.out.println("First non-repeating character: " + res);
        sc.close();
    }
}
