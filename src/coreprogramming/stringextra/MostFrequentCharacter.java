package coreprogramming.stringextra;
import java.util.Scanner;

/*
 * MostFrequentCharacter: Determines the character that appears most frequently in a
 * given string using frequency counting. Tracks character occurrences and identifies
 * the character with the highest count value.
 */
public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int max = 0;
        char result = s.charAt(0);

        // Count frequency of each character and track the one with highest count
        for (int i = 0; i < s.length(); i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    count++;
            }
            if (count > max) {
                max = count;
                result = s.charAt(i);
            }
        }

        System.out.println(result);
    }
}
