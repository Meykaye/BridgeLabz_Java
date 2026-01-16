package coreprogramming.arrays.level1;
import java.util.Scanner;

// This class finds all factors of a given number using array resizing
public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // Validate that the input is positive
        if (number <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Find all factors by checking divisibility
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {

                // Double array size if more space is needed
                if (index >= maxFactor) {
                    maxFactor = maxFactor * 2;
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < index; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp;
                }

                factors[index] = i;
                index++;
            }
        }

        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
