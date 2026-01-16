package coreprogramming.string.level1;
import java.util.Scanner;

// Program to demonstrate IllegalArgumentException when substring indices are invalid
public class IllegalArgumentDemo {

    // Attempt to create substring with invalid indices (start > end)
    static void generateException(String s) {
        s.substring(5, 2);
    }

    // Handle IllegalArgumentException and other RuntimeExceptions
    static void handleException(String s) {
        try {
            s.substring(5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        try {
            generateException(text);
        } catch (Exception e) {
            handleException(text);
        }
        sc.close();
    }
}

