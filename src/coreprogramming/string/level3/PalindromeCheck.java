package coreprogramming.string.level3;
import java.util.Scanner;

/*
 * PalindromeCheck: Validates whether a given string reads identically forwards
 * and backwards using multiple algorithmic approaches including two-pointer loop
 * method and recursive implementations.
 */
public class PalindromeCheck {
    // Check palindrome using two-pointer approach with loop
    public static boolean isPalindromeLoop(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++; end--;
        }
        return true;
    }

    // Check palindrome using recursive two-pointer approach
    public static boolean isPalindromeRec(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return isPalindromeRec(s, start + 1, end - 1);
    }

    // Check palindrome by reversing string and comparing with original
    public static boolean isPalindromeReverse(String s) {
        char[] arr = s.toCharArray();
        char[] rev = new char[arr.length];
        for (int i = 0; i < arr.length; i++) rev[i] = arr[arr.length - 1 - i];
        for (int i = 0; i < arr.length; i++) if (arr[i] != rev[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        System.out.println("Loop check: " + isPalindromeLoop(text));
        System.out.println("Recursive check: " + isPalindromeRec(text,0,text.length()-1));
        System.out.println("Reverse array check: " + isPalindromeReverse(text));
        sc.close();
    }
}
