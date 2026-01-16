package coreprogramming.string.level2;
import java.util.Scanner;

// Program to create a table showing character types (vowel, consonant, or other)
public class CharacterTypeTable {

    // Identify character type: Vowel, Consonant, or Not a Letter
    public static String checkCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32); // convert to lowercase
        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) != -1) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }

    // Create 2D table with each character and its corresponding type
    public static String[][] charTypeTable(String text) {
        int len = text.length();
        String[][] table = new String[len][2];
        for (int i = 0; i < len; i++) {
            table[i][0] = "" + text.charAt(i);
            table[i][1] = checkCharType(text.charAt(i));
        }
        return table;
    }

    // Display character-type table in formatted output
    public static void displayTable(String[][] table) {
        System.out.println("Char\tType");
        for (String[] row : table) System.out.println(row[0] + "\t" + row[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = sc.nextLine();

        String[][] table = charTypeTable(text);
        displayTable(table);
        sc.close();
    }
}
