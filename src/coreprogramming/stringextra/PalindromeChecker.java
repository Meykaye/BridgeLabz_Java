package coreprogramming.stringextra;
import java.util.Scanner;

// This class checks if a string is a palindrome (reads the same forwards and backwards)
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = "";

        // Reverse the string by iterating from end to beginning
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        // Compare original with reversed string
        if (s.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
