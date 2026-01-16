package coreprogramming.string.level2;

/*
 * StudentScoreCard: Generates random test scores for multiple students across
 * three subjects and calculates comprehensive statistics including total scores,
 * averages, percentages, and letter grades. Displays results in a formatted table.
 */
public class StudentScoreCard {

    // Generate random scores for students across three subjects
    static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                scores[i][j] = (int)(Math.random() * 100);
        return scores;
    }

    // Calculate total, average, and percentage for each student
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

    // Assign grades based on percentage (A: 90+, B: 75+, C: 60+, D: <60)
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
