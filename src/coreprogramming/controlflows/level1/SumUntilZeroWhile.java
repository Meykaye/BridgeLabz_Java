package coreprogramming.controlflows.level1;
import java.util.Scanner;

public class SumUntilZeroWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int num = scanner.nextInt();
            if (num <= 0) {
                break;
            }
            sum += num;
        }
        System.out.println("Sum until non-positive number: " + sum);
        scanner.close();
    }
}