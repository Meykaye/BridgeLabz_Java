package coreprogramming.string.level3;
import java.util.Scanner;

public class UniqueCharacters {
    public static int lengthWithoutLength(String s) {
        int count = 0;
        try { while(true) { s.charAt(count); count++; } } catch(Exception e) {}
        return count;
    }

    public static char[] findUniqueChars(String text) {
        int len = lengthWithoutLength(text);
        char[] temp = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++) {
            char c = text.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) { unique = false; break; }
            }
            if (unique) temp[index++] = c;
        }
        char[] result = new char[index];
        for (int i = 0; i < index; i++) result[i] = temp[i];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        char[] unique = findUniqueChars(text);
        System.out.print("Unique characters: ");
        for (char c : unique) System.out.print(c + " ");
        sc.close();
    }
}
