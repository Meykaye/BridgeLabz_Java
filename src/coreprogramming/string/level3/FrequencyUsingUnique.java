package coreprogramming.string.level3;
import java.util.Scanner;

public class FrequencyUsingUnique {
    public static char[] findUniqueChars(String text) {
        char[] temp = new char[text.length()];
        int index = 0;
        for (int i = 0; i < text.length(); i++) {
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

    public static String[][] frequency(String text) {
        char[] unique = findUniqueChars(text);
        String[][] result = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            int count = 0;
            for (int j = 0; j < text.length(); j++) if (text.charAt(j) == unique[i]) count++;
            result[i][0] = Character.toString(unique[i]);
            result[i][1] = Integer.toString(count);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String[][] freq = frequency(text);
        System.out.println("Character Frequency:");
        System.out.printf("%-10s%-10s\n", "Char", "Freq");
        for (String[] row : freq) System.out.printf("%-10s%-10s\n", row[0], row[1]);
        sc.close();
    }
}
