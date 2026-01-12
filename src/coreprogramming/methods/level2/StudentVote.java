package coreprogramming.methods.level2;
import java.util.*;

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

