package coreprogramming.string.level2;
import java.util.Scanner;

public class StringLengthFinder {

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

