package coreprogramming.arrays.level1;
import java.util.Scanner;

/*
 * This class reads positive numbers from user input, stores them in an array,
 * and calculates their sum. It filters out non-positive numbers and only
 * accumulates the sum of valid positive values. This demonstrates input
 * validation, array storage, and accumulation logic.
 */
public class StoreAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;

        // Read positive numbers until a non-positive value or array limit is reached
        while (true) {
            double num = sc.nextDouble();
            if (num <= 0 || index == 10) {
                break;
            }
            arr[index++] = num;
        }

        // Display each number and accumulate the total sum
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
            total += arr[i];
        }

        System.out.println("Total = " + total);
    }
}

