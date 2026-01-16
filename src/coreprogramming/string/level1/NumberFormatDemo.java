package coreprogramming.string.level1;
import java.util.Scanner;

// Program to demonstrate NumberFormatException when parsing invalid numeric strings
public class NumberFormatDemo {

    // Attempt to parse non-numeric string to trigger exception
    static void generateException(String text) {
        Integer.parseInt(text);
    }

    // Handle NumberFormatException and other RuntimeExceptions
    static void handleException(String text) {
        try {
            Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
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

