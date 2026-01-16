package coreprogramming.controlflows.level2;
import java.util.Scanner;

/*
 * This class identifies and prints which numbers from 1 to n are odd or even.
 * It uses the modulo operator to classify each number and displays the results.
 * This demonstrates number classification and conditional printing.
 */
public class OddEven {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number < 1){
            System.out.println("Please enter a natural number.");
        } else {
            for(int i = 1; i <= number; i++){
                if(i % 2 == 0){
                    System.out.println(i + " is even");
                } else {
                    System.out.println(i + " is odd");
                }
            }
        }
        sc.close();
    }
}
