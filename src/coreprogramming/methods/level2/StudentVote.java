package coreprogramming.methods.level2;
import java.util.*;

/*
 * This class determines whether a student is eligible to vote based on their age.
 * A student must be at least 18 years old to be eligible.
 * It demonstrates simple eligibility checking and conditional logic.
 */
public class StudentVote {
    static boolean canVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int age = sc.nextInt();
            System.out.println(canVote(age));
        }
    }
}

