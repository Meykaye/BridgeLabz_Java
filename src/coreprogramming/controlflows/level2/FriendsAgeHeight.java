package ControlFlow.Level2;
import java.util.Scanner;

public class FriendsAgeHeight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ages of Amar, Akbar, Anthony:");
        int age1 = sc.nextInt();
        int age2 = sc.nextInt();
        int age3 = sc.nextInt();

        System.out.println("Enter heights of Amar, Akbar, Anthony (cm):");
        int height1 = sc.nextInt();
        int height2 = sc.nextInt();
        int height3 = sc.nextInt();

        int youngestAge = Math.min(age1, Math.min(age2, age3));
        int tallestHeight = Math.max(height1, Math.max(height2, height3));

        System.out.println("The youngest friend's age is " + youngestAge);
        System.out.println("The tallest friend's height is " + tallestHeight);

        sc.close();
    }
}

