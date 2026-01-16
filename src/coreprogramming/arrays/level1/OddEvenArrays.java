package coreprogramming.arrays.level1;
import java.util.Scanner;

// This class separates numbers from 1 to n into odd and even arrays
public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // Validate positive input
        if (number <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int[] odd = new int[number / 2 + 1];
        int[] even = new int[number / 2 + 1];
        int o = 0, e = 0;

        // Segregate numbers into odd and even arrays
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[e++] = i;
            } else {
                odd[o++] = i;
            }
        }

        for (int i = 0; i < o; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < e; i++) {
            System.out.print(even[i] + " ");
        }
    }
}