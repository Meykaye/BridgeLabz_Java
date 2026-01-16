package coreprogramming.arrays.level1;
import java.util.Scanner;

// This class checks voting eligibility for 10 students based on their ages
public class VotingCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        // Read ages of 10 students
        for (int i = 0; i < ages.length; i++) {
            ages[i] = sc.nextInt();
        }

        // Check each student's voting eligibility (must be >= 18)
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Invalid age");
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote");
            }
        }
    }
}
