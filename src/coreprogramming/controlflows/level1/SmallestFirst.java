package coreprogramming.controlflows.level1;
import java.util.Scanner;

/*
 * This class checks whether the first of three numbers is the smallest among them.
 * It uses logical AND operators to compare the first number with the other two.
 * This demonstrates boolean logic and multiple comparisons in conditional expressions.
 */
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
