package coreprogramming.string.level1;
import java.util.Scanner;

// Program to demonstrate StringIndexOutOfBoundsException and exception handling
public class StringIndexOutOfBoundsDemo {

    // Attempt to access character at invalid index to trigger exception
    static void generateException(String s) {
        s.charAt(s.length());
    }

    // Handle StringIndexOutOfBoundsException by catching it
    static void handleException(String s) {
        try {
            s.charAt(s.length());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
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