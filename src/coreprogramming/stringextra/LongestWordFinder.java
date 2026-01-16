package coreprogramming.stringextra;
import java.util.Scanner;

/*
 * LongestWordFinder: Identifies the longest word in a given string by parsing words
 * separated by spaces and comparing their lengths. Handles multiple spaces and returns
 * the first occurrence if multiple words share the maximum length.
 */
public class LongestWordFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");  // Split by spaces
        String longest = "";

        // Compare each word to find the one with maximum length
        for (String word : words) {
            if (word.length() > longest.length())
                longest = word;
        }

        System.out.println(longest);
    }
}
