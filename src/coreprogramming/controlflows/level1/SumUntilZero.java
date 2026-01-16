package coreprogramming.controlflows.level1;
import java.util.Scanner;

/*
 * This class accumulates the sum of numbers entered by the user until 0 is entered.
 * It uses a while(true) loop with a break statement to terminate.
 * This demonstrates unbounded loops and conditional termination logic.
 */
public class SumUntilZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double number;

        while(true){
            number = sc.nextDouble();
            if(number == 0) break;
            total += number;
        }

        System.out.println("Total sum is " + total);
        sc.close();
    }
}

