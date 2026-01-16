package coreprogramming.string.level3;
import java.util.Scanner;

// Program to count frequency of each character in a string
public class FrequencyChar {
    // Build frequency table of all characters in the string
    public static String[][] frequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) freq[text.charAt(i)]++;
        int count = 0;
        for (int f : freq) if (f > 0) count++;
        String[][] result = new String[count][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = Character.toString((char)i);
                result[index][1] = Integer.toString(freq[i]);
                index++;
            }
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
