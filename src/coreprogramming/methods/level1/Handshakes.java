package coreprogramming.methods.level1;
import java.util.*;

// Calculates total number of unique handshakes among n students using combination formula
public class Handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = sc.nextInt();
        int handshakes = calculateHandshakes(numberOfStudents);
        System.out.println(handshakes);
        sc.close();
    }

    // Returns n*(n-1)/2 which is the number of unique handshakes possible
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}

