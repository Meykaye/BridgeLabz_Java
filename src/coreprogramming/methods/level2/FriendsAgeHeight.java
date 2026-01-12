package coreprogramming.methods.level2;
import java.util.*;

public class FriendsAgeHeight {
    static int youngest(int[] a) {
        int m = a[0];
        for (int x : a) if (x < m) m = x;
        return m;
    }
    static double tallest(double[] h) {
        double m = h[0];
        for (double x : h) if (x > m) m = x;
        return m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[3];
        double[] height = new double[3];
        for (int i = 0; i < 3; i++) age[i] = sc.nextInt();
        for (int i = 0; i < 3; i++) height[i] = sc.nextDouble();
        System.out.println(youngest(age));
        System.out.println(tallest(height));
    }
}

