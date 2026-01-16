package coreprogramming.controlflows.level1;
import java.util.Scanner;

/*
 * This class prints numbers in descending order from a given value down to 1
 * using a while loop. Unlike the for loop, while loop requires manual management
 * of the counter variable. This demonstrates while loop usage and manual loop control.
 */
public class CountdownWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();

        while(counter >= 1){
            System.out.println(counter);
            counter--;
        }

        sc.close();
    }
}

