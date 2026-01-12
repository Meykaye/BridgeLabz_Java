package coreprogramming.methods.level3;
import java.util.*;

public class NumberCheckerPalindrome {
    static int[] digits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            d[i] = s.charAt(i) - '0';
        return d;
    }
    static int[] reverse(int[] d) {
        int[] r = new int[d.length];
        for (int i = 0; i < d.length; i++)
            r[i] = d[d.length - 1 - i];
        return r;
    }
    static boolean equal(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }
    static boolean palindrome(int n) {
        int[] d = digits(n);
        return equal(d, reverse(d));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(palindrome(n));
    }
}
