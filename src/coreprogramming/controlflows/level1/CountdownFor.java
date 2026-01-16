package coreprogramming.controlflows.level1;
import java.util.Scanner;

/*
 * This class prints numbers in descending order from a given value down to 1
 * using a for loop. The for loop decrement operator makes iteration easy and clear.
 * This demonstrates loop control flow and the for loop structure for counting operations.
 */
public class CountdownFor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();

        for(int i = counter; i >= 1; i--){
            System.out.println(i);
        }

        sc.close();
    }
}

