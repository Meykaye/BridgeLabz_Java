package coreprogramming.string.level2;
import java.util.Scanner;

/*
 * RockPaperScissorsGame: Implements an interactive game where a human player
 * competes against the computer in multiple rounds of Rock-Paper-Scissors.
 * Tracks wins, losses, and ties while providing an engaging user experience
 * with proper game logic and winner determination.
 */
public class RockPaperScissorsGame {
    // Generate random choice for computer: rock, paper, or scissors
    static String computerChoice() {
        int r = (int)(Math.random() * 3);
        return r == 0 ? "rock" : r == 1 ? "paper" : "scissors";
    }

    // Determine winner: 1 for user, -1 for computer, 0 for tie
    static int findWinner(String user, String comp) {
        if (user.equals(comp)) return 0;
        if (user.equals("rock") && comp.equals("scissors")) return 1;
        if (user.equals("paper") && comp.equals("rock")) return 1;
        if (user.equals("scissors") && comp.equals("paper")) return 1;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();
        int userWin = 0, compWin = 0;

        for (int i = 0; i < games; i++) {
            String user = sc.next();
            String comp = computerChoice();
            int res = findWinner(user, comp);
            if (res == 1) userWin++;
            if (res == -1) compWin++;
            System.out.println(user + "\t" + comp);
        }

        System.out.println(userWin + "\t" + compWin);
        System.out.println((userWin * 100.0) / games);
        System.out.println((compWin * 100.0) / games);
        sc.close();
    }
}
