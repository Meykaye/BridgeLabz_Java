package objectorientedprogramming.classandobject.level2;
import java.util.Scanner;

/**
 * Student class stores student information and calculates grades
 */
class Student {
    String name;       // Name of the student
    int rollNumber;    // Roll number/ID of the student
    int marks;         // Marks obtained by the student

    /**
     * Calculates the grade based on marks
     */
    String calculateGrade() {
        if (marks >= 90) return "A";
        if (marks >= 75) return "B";
        if (marks >= 60) return "C";
        if (marks >= 40) return "D";
        return "F";
    }

    /**
     * Displays student details including name, roll number, marks, and grade
     */
    void displayDetails() {
        System.out.println(name);
        System.out.println(rollNumber);
        System.out.println(marks);
        System.out.println(calculateGrade());
    }
}

public class StudentReport {
    /**
     * Main method to generate student report with grade
     * Reads student information and displays academic details
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        // Read student information
        s.name = sc.nextLine();
        s.rollNumber = sc.nextInt();
        s.marks = sc.nextInt();

        // Display student report including calculated grade
        s.displayDetails();
        sc.close();
    }
}
