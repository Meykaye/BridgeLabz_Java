package coreprogramming.string.level2;
import java.util.Scanner;

public class RockPaperScissorsGame {
    static String computerChoice() {
        int r = (int)(Math.random() * 3);
        return r == 0 ? "rock" : r == 1 ? "paper" : "scissors";
    }

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
