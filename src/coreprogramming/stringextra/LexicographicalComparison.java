package coreprogramming.stringextra;
import java.util.Scanner;

// This class compares two strings lexicographically to determine their order
public class LexicographicalComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int i = 0;

        // Find the first position where characters differ
        while (i < s1.length() && i < s2.length() && s1.charAt(i) == s2.charAt(i))
            i++;

        // Determine lexicographic order
        if (i == s1.length() && i == s2.length())
            System.out.println("Strings are equal");
        else if (i == s1.length() || (i < s2.length() && s1.charAt(i) < s2.charAt(i)))
            System.out.println(s1 + " comes before " + s2);
        else
            System.out.println(s2 + " comes before " + s1);
    }
}
