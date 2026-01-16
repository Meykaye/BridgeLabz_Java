package coreprogramming.arrays.level1;
import java.util.Scanner;

/*
 * This class generates and displays the multiplication table of a given number.
 * It stores the multiplication results (from multiplier 1 to 10) in an array
 * and prints them. This demonstrates array initialization and basic arithmetic
 * operations in sequence.
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] table = new int[10];

        // Store multiplication results in array
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
    }
}
