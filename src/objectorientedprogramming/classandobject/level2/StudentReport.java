package objectorientedprogramming.classandobject.level2;
import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    int marks;

    String calculateGrade() {
        if (marks >= 90) return "A";
        if (marks >= 75) return "B";
        if (marks >= 60) return "C";
        if (marks >= 40) return "D";
        return "F";
    }

    void displayDetails() {
        System.out.println(name);
        System.out.println(rollNumber);
        System.out.println(marks);
        System.out.println(calculateGrade());
    }
}

public class StudentReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        s.name = sc.nextLine();
        s.rollNumber = sc.nextInt();
        s.marks = sc.nextInt();

        s.displayDetails();
    }
}
