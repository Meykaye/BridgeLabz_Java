package coreprogramming.methods.level1;
import java.util.*;

/*
 * This class divides a given quantity of chocolates equally among a specified number
 * of children and calculates how many chocolates remain undistributed.
 * It demonstrates integer division and modulo operations for distribution problems.
 */
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

    // Calculates chocolates per child and remaining chocolates using division and modulo
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int eachChild = number / divisor;
        int remaining = number % divisor;
        return new int[]{eachChild, remaining};
    }
}

