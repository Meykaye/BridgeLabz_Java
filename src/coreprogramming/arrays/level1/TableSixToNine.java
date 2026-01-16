package coreprogramming.arrays.level1;
import java.util.Scanner;

/*
 * This class generates multiplication tables for a given number using
 * multipliers 6 through 9. Results are stored in an array and displayed.
 * This demonstrates array-based computation and multiple iterations with
 * dynamic multiplier values.
 */
public class TableSixToNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] result = new int[4];

        // Store multiplication results for 6 through 9
        int idx = 0;
        for (int i = 6; i <= 9; i++) {
            result[idx++] = number * i;
        }

        idx = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + result[idx++]);
        }
    }
}

