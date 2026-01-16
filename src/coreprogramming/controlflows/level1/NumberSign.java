package coreprogramming.controlflows.level1;
import java.util.Scanner;

// Determines if a number is positive, negative, or zero
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

