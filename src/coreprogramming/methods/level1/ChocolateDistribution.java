package coreprogramming.methods.level1;
import java.util.*;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt();
        int children = sc.nextInt();
        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println(result[0]);
        System.out.println(result[1]);
        sc.close();
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int eachChild = number / divisor;
        int remaining = number % divisor;
        return new int[]{eachChild, remaining};
    }
}

