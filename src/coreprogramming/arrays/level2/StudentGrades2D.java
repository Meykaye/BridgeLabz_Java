package coreprogramming.arrays.level2;
import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int c = sc.nextInt();
            int m = sc.nextInt();

            if (p < 0 || c < 0 || m < 0) {
                i--;
                continue;
            }

            marks[i][0] = p;
            marks[i][1] = c;
            marks[i][2] = m;
        }

        for (int i = 0; i < n; i++) {
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percentage[i] >= 80)
                grade[i] = "A";
            else if (percentage[i] >= 70)
                grade[i] = "B";
            else if (percentage[i] >= 60)
                grade[i] = "C";
            else if (percentage[i] >= 50)
                grade[i] = "D";
            else if (percentage[i] >= 40)
                grade[i] = "E";
            else
                grade[i] = "R";
        }

        for (int i = 0; i < n; i++) {
            System.out.println(
                    marks[i][0] + " " +
                            marks[i][1] + " " +
                            marks[i][2] + " " +
                            percentage[i] + " " +
                            grade[i]
            );
        }
    }
}
