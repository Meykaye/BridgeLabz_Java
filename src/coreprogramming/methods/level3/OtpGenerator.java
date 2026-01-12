package coreprogramming.methods.level3;
import java.util.*;

public class OtpGenerator {
    static int generate() {
        return (int)(Math.random() * 900000) + 100000;
    }
    static boolean unique(int[] a) {
        for (int i = 0; i < a.length; i++)
            for (int j = i + 1; j < a.length; j++)
                if (a[i] == a[j]) return false;
        return true;
    }
    public static void main(String[] args) {
        int[] otp = new int[10];
        for (int i = 0; i < 10; i++) {
            otp[i] = generate();
            System.out.println(otp[i]);
        }
        System.out.println(unique(otp));
    }
}
