package coreprogramming.controlflows.level2;
import java.util.Scanner;

public class FactorsWhileLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i = 1;

        if(number <= 0){
            System.out.println("Enter a positive integer.");
        } else {
            System.out.println("Factors of " + number + ":");
            while(i <= number){
                if(number % i == 0){
                    System.out.println(i);
                }
                i++;
            }
        }

        sc.close();
    }
}

