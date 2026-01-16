package coreprogramming.controlflows.level2;
import java.util.Scanner;

/*
 * This class prints all multiples of a given number that are less than 100
 * using a while loop with increment steps equal to the number.
 * This demonstrates efficient multiple finding using while loop iteration.
 */
public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0 && number < 100) {
            int multiple = number;
            while (multiple < 100) {
                System.out.println(multiple);
                multiple += number;
            }
        }
        scanner.close();
    }
}
