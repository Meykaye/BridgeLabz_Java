package coreprogramming.string.level2;
import java.util.Scanner;

// Program to compare custom word splitting with built-in split method
public class WordSplitComparison {

    // Find string length by attempting to access each character until exception
    static int findLength(String s) {
        int c = 0;
        try {
            while (true) {
                s.charAt(c);
                c++;
            }
        } catch (Exception e) {
            return c;
        }
    }

    // Split string into words based on space delimiter
    static String[] splitWords(String text) {
        int len = findLength(text);
        int count = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') count++;
        }

        String[] words = new String[count];
        int start = 0, index = 0;

        for (int i = 0; i <= len; i++) {
            if (i == len || text.charAt(i) == ' ') {
                String word = "";
                for (int j = start; j < i; j++) {
                    word += text.charAt(j);
                }
                words[index++] = word;
                start = i + 1;
            }
        }
        return words;
    }

    // Compare two string arrays for equality
    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] userWords = splitWords(text);
        String[] builtInWords = text.split(" ");
        System.out.println(compareArrays(userWords, builtInWords));
        sc.close();
    }
}

