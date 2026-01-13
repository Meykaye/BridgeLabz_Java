package coreprogramming.string.level2;
public class StudentScoreCard {

    static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                scores[i][j] = (int)(Math.random() * 100);
        return scores;
    }

    static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][4];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            stats[i][0] = total;
            stats[i][1] = Math.round((total / 3.0) * 100) / 100.0;
            stats[i][2] = Math.round((total / 300.0 * 100) * 100) / 100.0;
        }
        return stats;
    }

    static String[] calculateGrades(double[][] stats) {
        String[] grades = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double p = stats[i][2];
            grades[i] = p >= 90 ? "A" : p >= 75 ? "B" : p >= 60 ? "C" : "D";
        }
        return grades;
    }

    public static void main(String[] args) {
        int[][] scores = generateScores(5);
        double[][] stats = calculateStats(scores);
        String[] grades = calculateGrades(stats);

        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                    scores[i][0] + "\t" +
                            scores[i][1] + "\t" +
                            scores[i][2] + "\t" +
                            stats[i][0] + "\t" +
                            stats[i][1] + "\t" +
                            stats[i][2] + "\t" +
                            grades[i]
            );
        }
    }
}
