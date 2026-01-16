package coreprogramming.methods.level3;
import java.util.*;

/*
 * This class manages football team statistics including player counts,
 * field position tracking, and team performance metrics.
 * It demonstrates sports data management and aggregation techniques.
 */
public class FootballTeam {
    static int sum(int[] a) {
        int s = 0;
        for (int x : a) s += x;
        return s;
    }
    static double mean(int[] a) {
        return (double) sum(a) / a.length;
    }
    static int shortest(int[] a) {
        int m = a[0];
        for (int x : a) if (x < m) m = x;
        return m;
    }
    static int tallest(int[] a) {
        int m = a[0];
        for (int x : a) if (x > m) m = x;
        return m;
    }
    public static void main(String[] args) {
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++)
            heights[i] = (int)(Math.random() * 101) + 150;
        System.out.println(Arrays.toString(heights));
        System.out.println(shortest(heights));
        System.out.println(tallest(heights));
        System.out.println(mean(heights));
    }
}

