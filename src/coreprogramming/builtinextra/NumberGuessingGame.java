package coreprogramming.builtinextra;
import java.util.Scanner;

// This class implements a number guessing game using binary search strategy
public class NumberGuessingGame {
    static Scanner sc = new Scanner(System.in);

    // Generate a guess as midpoint of range
    static int generateGuess(int low, int high) {
        return (low + high) / 2;
    }

    // Get feedback from user (high/low/correct)
    static String getFeedback() {
        return sc.nextLine().toLowerCase();
    }

    public static void main(String[] args) {
        int low = 1, high = 100;
        String feedback;

        // Keep guessing until number is found
        while (true) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (high/low/correct)");
            feedback = getFeedback();

            if (feedback.equals("correct")) {
                System.out.println("Guessed correctly!");
                break;
            } else if (feedback.equals("high")) {
                // Guess is too high, search lower half
                high = guess - 1;
            } else if (feedback.equals("low")) {
                // Guess is too low, search upper half
                low = guess + 1;
            }
        }
    }
}
