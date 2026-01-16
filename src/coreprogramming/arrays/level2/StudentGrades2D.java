package coreprogramming.arrays.level2;
import java.util.Scanner;

// This class uses 2D array to store marks and calculates grades for students
public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] marks = new int[n][3];  // [0]=Physics, [1]=Chemistry, [2]=Maths
        double[] percentage = new double[n];
        String[] grade = new String[n];

        // Read marks for three subjects, validating non-negative values
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

        // Calculate percentage and assign grade for each student
        for (int i = 0; i < n; i++) {
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            // Grade assignment based on percentage thresholds
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

        // Display results
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
