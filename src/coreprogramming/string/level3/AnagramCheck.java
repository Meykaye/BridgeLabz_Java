package coreprogramming.string.level3;
import java.util.Scanner;

// Program to check if two strings are anagrams using character frequency
public class AnagramCheck {
    // Check if two strings are anagrams by comparing character frequencies
    public static boolean areAnagrams(String a, String b) {
        if (a.length() != b.length()) return false;
        int[] freqA = new int[256], freqB = new int[256];
        for (int i = 0; i < a.length(); i++) freqA[a.charAt(i)]++;
        for (int i = 0; i < b.length(); i++) freqB[b.charAt(i)]++;
        for (int i = 0; i < 256; i++) if (freqA[i] != freqB[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        System.out.println("Are anagrams: " + areAnagrams(s1, s2));
        sc.close();
    }
}
