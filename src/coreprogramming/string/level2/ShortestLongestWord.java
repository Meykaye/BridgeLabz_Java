package coreprogramming.string.level2;
import java.util.Scanner;

/*
 * ShortestLongestWord: Analyzes a user-provided sentence to identify and
 * display the shortest and longest words. Uses custom string length calculation
 * via exception handling instead of built-in methods and compares word lengths
 * to determine extremes.
 */
public class ShortestLongestWord {

    // Find string length using exception handling
    static int findLength(String s) {
        int c = 0;
        try {
            while (true) s.charAt(c++);
        } catch (Exception e) {
            return c - 1;
        }
    }

    // Split string into individual words by space delimiter
    static String[] splitWords(String text) {
        int count = 1;
        for (int i = 0; i < findLength(text); i++)
            if (text.charAt(i) == ' ') count++;

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

    // Find minimum and maximum word lengths in the array
    static int[] findMinMax(String[] words) {
        int min = findLength(words[0]);
        int max = min;

        for (String w : words) {
            int len = findLength(w);
            if (len < min) min = len;
            if (len > max) max = len;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int[] result = findMinMax(splitWords(text));
        System.out.println(result[0]);
        System.out.println(result[1]);
        sc.close();
    }
}
