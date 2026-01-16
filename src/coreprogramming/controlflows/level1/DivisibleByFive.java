package coreprogramming.controlflows.level1;
import java.util.Scanner;

/*
 * This class checks whether a given number is divisible by 5.
 * It uses the modulo operator (%) to determine divisibility and displays
 * an appropriate message. This demonstrates conditional logic and the ternary operator.
 */
public class DivisibleByFive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(num % 5 == 0 ? num +" is Divisible by 5" : num + " is not Divisible by 5");
        sc.close();
    }
}
