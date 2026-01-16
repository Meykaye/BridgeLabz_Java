package objectorientedprogramming.classandobject.level2;
import java.util.Scanner;

/**
 * PalindromeChecker checks if a word reads the same forwards and backwards
 */
class PalindromeChecker {
    String text;  // The text to check for palindrome property

    /**
     * Checks if the text is a palindrome by comparing characters from both ends.
     * Time Complexity: O(n) where n is the length of the text
     * @return true if text is palindrome, false otherwise
     */
    boolean isPalindrome() {
        int i = 0, j = text.length() - 1;
        
        // Compare characters from start and end moving towards center
        while (i < j) {
            if (text.charAt(i) != text.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    /**
     * Displays whether the text is a palindrome or not
     */
    void displayResult() {
        System.out.println(isPalindrome() ? "Palindrome" : "Not Palindrome");
    }
}

public class PalindromeProgram {
    /**
     * Main method to test palindrome checking functionality
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalindromeChecker p = new PalindromeChecker();

        // Read text from user
        p.text = sc.nextLine();
        
        // Check and display if it's a palindrome
        p.displayResult();
        sc.close();
    }
}
