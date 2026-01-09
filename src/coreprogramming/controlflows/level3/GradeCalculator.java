package ControlFlow.Level3;
import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int physics = input.nextInt();
        int chemistry = input.nextInt();
        int maths = input.nextInt();
        double average = (physics + chemistry + maths) / 3.0;
        String grade, remarks;
        if (average >= 90) {
            grade = "A+";
            remarks = "Excellent";
        } else if (average >= 80) {
            grade = "A";
            remarks = "Very Good";
        } else if (average >= 70) {
            grade = "B";
            remarks = "Good";
        } else if (average >= 60) {
            grade = "C";
            remarks = "Average";
        } else if (average >= 50) {
            grade = "D";
            remarks = "Needs Improvement";
        } else {
            grade = "F";
            remarks = "Fail";
        }
        System.out.printf("Average Mark: %.2f\n", average);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        input.close();
    }
}
