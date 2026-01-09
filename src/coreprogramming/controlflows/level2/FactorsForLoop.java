package ControlFlow.Level2;
import java.util.Scanner;

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
