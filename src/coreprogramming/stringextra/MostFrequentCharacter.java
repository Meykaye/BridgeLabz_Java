package coreprogramming.stringextra;
import java.util.Scanner;

// This class finds the most frequently occurring character in a string
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
