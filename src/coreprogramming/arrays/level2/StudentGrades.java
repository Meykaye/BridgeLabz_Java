package coreprogramming.arrays.level2;
import java.util.Scanner;

// This class calculates student percentage and assigns grades based on subject marks
public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
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

            physics[i] = p;
            chemistry[i] = c;
            maths[i] = m;
        }

        // Calculate percentage and assign grade for each student
        for (int i = 0; i < n; i++) {
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

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
                    physics[i] + " " +
                            chemistry[i] + " " +
                            maths[i] + " " +
                            percentage[i] + " " +
                            grade[i]
            );
        }
    }
}

