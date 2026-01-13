package coreprogramming.string.level2;
import java.util.Scanner;

public class WordLengthTable {

    static int findLength(String s) {
        int c = 0;
        try {
            while (true) {
                s.charAt(c++);
            }
        } catch (Exception e) {
            return c - 1;
        }
    }

    static String[] splitWords(String text) {
        int count = 1;
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ') count++;
        }

        String[] words = new String[count];
        int start = 0, idx = 0;

        for (int i = 0; i <= findLength(text); i++) {
            if (i == findLength(text) || text.charAt(i) == ' ') {
                String w = "";
                for (int j = start; j < i; j++) w += text.charAt(j);
                words[idx++] = w;
                start = i + 1;
            }
        }
        return words;
    }

    static String[][] createWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[][] table = createWordLengthTable(splitWords(text));

        for (String[] row : table) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
        sc.close();
    }
}

