package coreprogramming.controlflows.level1;
import java.util.Scanner;

/*
 * This class checks whether a person is eligible to vote based on their age.
 * A person must be at least 18 years old to be eligible.
 * This demonstrates simple if-else conditional branching for eligibility determination.
 */
public class VotingEligibility {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        sc.close();
    }
}

