package coreprogramming.controlflows.level1;
import java.util.Scanner;

// Checks if the first number is the smallest among three numbers
public class SmallestFirst {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();

        boolean isSmallest = number1 < number2 && number1 < number3;
        System.out.println("Is the first number the smallest? " + isSmallest);

        sc.close();
    }
}
