package coreprogramming.controlflows.level2;
import java.util.Scanner;

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
