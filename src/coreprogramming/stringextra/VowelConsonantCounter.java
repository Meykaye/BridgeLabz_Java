package coreprogramming.stringextra;
import java.util.Scanner;

/*
 * VowelConsonantCounter: Counts and categorizes vowels and consonants in a string
 * while handling both uppercase and lowercase letters. Ignores non-alphabetic
 * characters and provides separate counts for each category.
 */
public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        int vowels = 0, consonants = 0;

        // Iterate through each character and classify as vowel or consonant
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {  // Only count alphabetic characters
                if ("aeiou".indexOf(c) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}