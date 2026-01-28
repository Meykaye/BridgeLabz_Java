package objectorientedprogramming.objectorienteddesignprinciples;
import java.util.ArrayList;

class Course {
    String name;
    ArrayList<Student> students = new ArrayList<>();

    Course(String name) {
        this.name = name;
    }
}

class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enroll(Course c) {
        courses.add(c);
        c.students.add(this);
    }
}

class School {
    String name;
    ArrayList<Student> students = new ArrayList<>();

    School(String name) {
        this.name = name;
    }

    void addStudent(Student s) {
        students.add(s);
    }

    public static void main(String[] args) {
        School s = new School("ABC School");
        Student st = new Student("Raj");
        Course c = new Course("Math");

        s.addStudent(st);
        st.enroll(c);
    }
}
