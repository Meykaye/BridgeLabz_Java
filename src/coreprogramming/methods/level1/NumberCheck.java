package coreprogramming.methods.level1;
import java.util.*;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = checkNumber(number);
        System.out.println(result);
        sc.close();
    }

    public static int checkNumber(int number) {
        if (number > 0) return 1;
        if (number < 0) return -1;
        return 0;
    }
}