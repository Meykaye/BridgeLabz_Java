package coreprogramming.builtinextra;
import java.util.Scanner;

public class NumberGuessingGame {
    static Scanner sc = new Scanner(System.in);

    static int generateGuess(int low, int high) {
        return (low + high) / 2;
    }

    static String getFeedback() {
        return sc.nextLine().toLowerCase();
    }

    public static void main(String[] args) {
        int low = 1, high = 100;
        String feedback;

        while (true) {
            int guess = generateGuess(low, high);
            System.out.println("Is your number " + guess + "? (high/low/correct)");
            feedback = getFeedback();

            if (feedback.equals("correct")) {
                System.out.println("Guessed correctly!");
                break;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            }
        }
    }
}
