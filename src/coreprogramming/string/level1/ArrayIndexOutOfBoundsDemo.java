package coreprogramming.string.level1;
import java.util.Scanner;

/*
 * This program demonstrates ArrayIndexOutOfBoundsException and how to handle it.
 * ArrayIndexOutOfBoundsException is thrown when attempting to access an array
 * element at an invalid index (outside the array bounds).
 */
public class ArrayIndexOutOfBoundsDemo {

    // Attempt to access array element at invalid index
    static void generateException(String[] arr) {
        System.out.println(arr[arr.length]);
    }

    // Handle ArrayIndexOutOfBoundsException by catching it
    static void handleException(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }
        try {
            generateException(names);
        } catch (Exception e) {
            handleException(names);
        }
        sc.close();
    }
}

