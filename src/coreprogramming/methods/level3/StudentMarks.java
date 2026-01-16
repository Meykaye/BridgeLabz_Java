package coreprogramming.methods.level3;

import java.util.Scanner;

/*
 * This class manages student academic performance by tracking marks
 * across multiple subjects and calculating aggregate statistics.
 * It demonstrates academic data management and grade computation.
 */
public class StudentMarks {

    static int[][] generateMarks(int n) {
        int[][] marks = new int[n][3]; // physics, chemistry, maths
        for (int i = 0; i < n; i++) {
            marks[i][0] = (int)(Math.random() * 100);
            marks[i][1] = (int)(Math.random() * 100);
            marks[i][2] = (int)(Math.random() * 100);
        }
        return marks;
    }

    static double[][] calculateTotals(int[][] marks) {
        int n = marks.length;
        double[][] result = new double[n][3]; // total, avg, %age
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percent = total / 3.0; // assume max 100 per subject
            result[i][0] = total;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return result;
    }

    static void display(int[][] marks, double[][] totals) {
        System.out.println("Physics\tChem\tMaths\tTotal\tAvg\t%age");
        for (int i = 0; i < marks.length; i++)
            System.out.printf("%d\t%d\t%d\t%.2f\t%.2f\t%.2f\n",
                    marks[i][0], marks[i][1], marks[i][2],
                    totals[i][0], totals[i][1], totals[i][2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of students: ");
        int n = sc.nextInt();
        int[][] marks = generateMarks(n);
        double[][] totals = calculateTotals(marks);
        display(marks, totals);
    }
}
