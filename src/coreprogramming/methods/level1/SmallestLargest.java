package coreprogramming.methods.level1;
import java.util.*;

// Finds the smallest and largest among three given numbers
public class SmallestLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] result = findSmallestAndLargest(a, b, c);
        System.out.println(result[0]);
        System.out.println(result[1]);
        sc.close();
    }

    // Uses Math.min and Math.max to find smallest and largest values
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));
        return new int[]{smallest, largest};
    }
}

