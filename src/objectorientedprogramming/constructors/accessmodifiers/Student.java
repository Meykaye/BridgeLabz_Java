package objectorientedprogramming.constructors.accessmodifiers;

public class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Amit", 8.5, "MTech");
        pg.displayDetails();
        pg.setCgpa(9.1);
        System.out.println(pg.getCgpa());
    }
}

class PostgraduateStudent extends Student {
    String course;

    PostgraduateStudent(int rollNumber, String name, double cgpa, String course) {
        super(rollNumber, name, cgpa);
        this.course = course;
    }

    void displayDetails() {
        System.out.println(rollNumber + " " + name + " " + course);
    }
}
