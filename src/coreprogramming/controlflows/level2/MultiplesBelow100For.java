package ControlFlow.Level2;
import java.util.Scanner;

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
