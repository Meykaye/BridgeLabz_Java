package coreprogramming.controlflows.level1;
import java.util.Scanner;

// Accumulates sum of numbers until user enters 0
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

