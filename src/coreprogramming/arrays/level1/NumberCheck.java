package coreprogramming.arrays.level1;
import java.util.Scanner;

// This class checks if numbers are positive/negative and even/odd, then compares first and last
public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        // Read 5 numbers
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Check each number's sign (positive/negative/zero) and parity (even/odd)
        for (int j : arr) {
            if (j > 0) {
                if (j % 2 == 0) {
                    System.out.println(j + " is positive and even");
                } else {
                    System.out.println(j + " is positive and odd");
                }
            } else if (j < 0) {
                System.out.println(j + " is negative");
            } else {
                System.out.println(j + " is zero");
            }
        }

        // Compare first and last elements
        if (arr[0] == arr[4]) {
            System.out.println("First and last elements are equal");
        } else if (arr[0] > arr[4]) {
            System.out.println("First element is greater");
        } else {
            System.out.println("Last element is greater");
        }
    }
}
