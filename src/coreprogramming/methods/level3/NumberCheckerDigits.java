package coreprogramming.methods.level3;
import java.util.Scanner;

/*
 * This class extracts and analyzes individual digits from numbers.
 * It converts numbers to strings to access individual digits and provides
 * utilities for digit manipulation and analysis.
 */
public class NumberCheckerDigits {

    static int[] digits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            d[i] = s.charAt(i) - '0';
        return d;
    }

    static boolean duck(int[] d) {
        for (int i = 1; i < d.length; i++)
            if (d[i] == 0) return true;
        return false;
    }

    static boolean armstrong(int n, int[] d) {
        int p = d.length;
        int s = 0;
        for (int x : d)
            s += (int) Math.pow(x, p);
        return s == n;
    }

    static void largestTwo(int[] d) {
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        for (int x : d) {
            if (x > a) {
                b = a;
                a = x;
            } else if (x > b && x != a) {
                b = x;
            }
        }
        System.out.println(a + " " + b);
    }

    static void smallestTwo(int[] d) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        for (int x : d) {
            if (x < a) {
                b = a;
                a = x;
            } else if (x < b && x != a) {
                b = x;
            }
        }
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = digits(n);
        System.out.println(duck(d));
        System.out.println(armstrong(n, d));
        largestTwo(d);
        smallestTwo(d);
    }
}
