package coreprogramming.methods.level3;
import java.util.*;

public class NumberCheckerSum {
    static int[] digits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
            d[i] = s.charAt(i) - '0';
        return d;
    }
    static int sum(int[] d) {
        int s = 0;
        for (int x : d) s += x;
        return s;
    }
    static int sumSquares(int[] d) {
        int s = 0;
        for (int x : d) s += (int)Math.pow(x, 2);
        return s;
    }
    static boolean harshad(int n, int[] d) {
        return n % sum(d) == 0;
    }
    static int[][] frequency(int[] d) {
        int[][] f = new int[10][2];
        for (int i = 0; i < 10; i++) f[i][0] = i;
        for (int x : d) f[x][1]++;
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = digits(n);
        System.out.println(sum(d));
        System.out.println(sumSquares(d));
        System.out.println(harshad(n, d));
        System.out.println(Arrays.deepToString(frequency(d)));
    }
}

