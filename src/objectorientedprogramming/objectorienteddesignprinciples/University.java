package objectorientedprogramming.objectorienteddesignprinciples;

import java.util.ArrayList;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }
}

class UniDepartment {
    String name;

    UniDepartment(String name) {
        this.name = name;
    }
}

class University {
    String name;
    ArrayList<UniDepartment> departments = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    void addDepartment(String name) {
        departments.add(new UniDepartment(name));
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }

    public static void main(String[] args) {
        University u = new University("SRM");
        u.addDepartment("CSE");

        Faculty f = new Faculty("Dr. Kumar");
        u.addFaculty(f);
    }
}
