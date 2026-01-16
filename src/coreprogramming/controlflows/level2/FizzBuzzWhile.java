package coreprogramming.controlflows.level2;
import java.util.Scanner;

/*
 * This class implements the FizzBuzz algorithm using a while loop.
 * It prints "Fizz" for multiples of 3, "Buzz" for multiples of 5,
 * "FizzBuzz" for multiples of both, and numbers otherwise.
 */
public class FizzBuzzWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        if(n <= 0){
            System.out.println("Enter a positive number.");
        } else {
            while(i <= n){
                if(i % 3 == 0 && i % 5 == 0){
                    System.out.println("FizzBuzz");
                } else if(i % 3 == 0){
                    System.out.println("Fizz");
                } else if(i % 5 == 0){
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++;
            }
        }
        sc.close();
    }
}

