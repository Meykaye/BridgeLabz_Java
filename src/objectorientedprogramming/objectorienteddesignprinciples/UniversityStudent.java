package objectorientedprogramming.objectorienteddesignprinciples;
import java.util.ArrayList;

class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }
}

class UniCourse {
    String name;
    Professor professor;
    ArrayList<UniversityStudent> students = new ArrayList<>();

    UniCourse(String name) {
        this.name = name;
    }

    void assignProfessor(Professor p) {
        professor = p;
    }
}

class UniversityStudent {
    String name;

    UniversityStudent(String name) {
        this.name = name;
    }

    void enrollCourse(UniCourse c) {
        c.students.add(this);
    }

    public static void main(String[] args) {
        UniversityStudent s = new UniversityStudent("Kiran");
        Professor p = new Professor("Dr. Sen");
        UniCourse c = new UniCourse("Java");

        c.assignProfessor(p);
        s.enrollCourse(c);
    }
}
