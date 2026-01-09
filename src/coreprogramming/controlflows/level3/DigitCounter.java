package ControlFlow.Level3;
import java.util.Scanner;

class DigitCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Math.abs(input.nextInt());
        int count = 0;
        if (number == 0) {
            count = 1;
        } else {
            while (number != 0) {
                number /= 10;
                count++;
            }
        }
        System.out.println("Number of digits: " + count);
        input.close();
    }
}
