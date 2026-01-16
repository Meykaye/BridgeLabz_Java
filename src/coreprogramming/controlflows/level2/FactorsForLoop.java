package coreprogramming.controlflows.level2;
import java.util.Scanner;

/*
 * This class finds and displays all factors of a given number using a for loop.
 * Factors are numbers that divide evenly into the input number with no remainder.
 * This demonstrates factor computation using loop-based divisibility testing.
 */
public class FactorsForLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number <= 0){
            System.out.println("Enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + ":");
            for(int i = 1; i <= number; i++){
                if(number % i == 0){
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}
