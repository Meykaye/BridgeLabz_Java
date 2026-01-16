package coreprogramming.controlflows.level2;
import java.util.Scanner;

/*
 * This class implements the FizzBuzz algorithm using a for loop.
 * It prints "Fizz" for multiples of 3, "Buzz" for multiples of 5,
 * "FizzBuzz" for multiples of both, and numbers otherwise.
 */
public class FizzBuzzFor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n <= 0){
            System.out.println("Enter a positive number.");
        } else {
            for(int i = 1; i <= n; i++){
                if(i % 3 == 0 && i % 5 == 0){
                    System.out.println("FizzBuzz");
                } else if(i % 3 == 0){
                    System.out.println("Fizz");
                } else if(i % 5 == 0){
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}

