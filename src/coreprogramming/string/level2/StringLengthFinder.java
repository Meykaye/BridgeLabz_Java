package coreprogramming.string.level2;
import java.util.Scanner;

// Program to find string length without using built-in length() method
public class StringLengthFinder {

    // Find length by attempting charAt until exception is caught
    static int findLength(String text) {
        int count = 0;
        if (text == null) return 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        System.out.println(findLength(text));
        System.out.println(text.length());
        sc.close();
    }
}

