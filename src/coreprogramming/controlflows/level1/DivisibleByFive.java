package coreprogramming.controlflows.level1;
import java.util.Scanner;

// Checks if a given number is divisible by 5
public class DivisibleByFive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(num % 5 == 0 ? num +" is Divisible by 5" : num + " is not Divisible by 5");
        sc.close();
    }
}
