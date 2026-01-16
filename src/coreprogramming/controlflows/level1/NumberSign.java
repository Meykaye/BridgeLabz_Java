package coreprogramming.controlflows.level1;
import java.util.Scanner;

/*
 * This class determines whether a given number is positive, negative, or zero.
 * It uses if-else if-else conditional statements to classify the number.
 * This demonstrates multi-way conditional branching based on relational comparisons.
 */
public class NumberSign {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number > 0){
            System.out.println("Positive");
        } else if(number < 0){
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        sc.close();
    }
}

