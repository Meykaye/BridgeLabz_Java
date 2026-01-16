package coreprogramming.controlflows.level2;
import java.util.Scanner;

// Prints all multiples of a given number that are below 100 using a for loop
public class MultiplesBelow100For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0 && number < 100) {
            for (int i = number; i < 100; i += number) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
