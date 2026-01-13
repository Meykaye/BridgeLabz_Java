package coreprogramming.string.level2;
import java.util.Scanner;

public class VowelConsonantCounter {

    static int checkChar(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c < 'a' || c > 'z') return 0;
        if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return 1;
        return 2;
    }

    static int[] countVowelsConsonants(String text) {
        int v = 0, c = 0;
        for (int i = 0; i < text.length(); i++) {
            int res = checkChar(text.charAt(i));
            if (res == 1) v++;
            if (res == 2) c++;
        }
        return new int[]{v, c};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int[] result = countVowelsConsonants(text);
        System.out.println(result[0]);
        System.out.println(result[1]);
        sc.close();
    }
}
