package coreprogramming.controlflows.level2;
import java.util.Scanner;

/*
 * This class prints the multiplication table for a given number using multipliers 6 through 9.
 * It demonstrates loop-based table generation with specific iteration range.
 */
public class MultiplicationTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int i = 6; i <= 9; i++){
            System.out.println(number + " * " + i + " = " + (number * i));
        }
        sc.close();
    }
}

