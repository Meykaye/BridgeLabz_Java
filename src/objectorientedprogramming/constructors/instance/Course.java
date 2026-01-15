package objectorientedprogramming.constructors.instance;

public class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "Tech Academy";

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails() {
        System.out.println(courseName + " " + duration + " " + fee + " " + instituteName);
    }

    static void updateInstituteName(String name) {
        instituteName = name;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 6, 12000);
        Course c2 = new Course("Python", 4, 10000);
        c1.displayCourseDetails();
        Course.updateInstituteName("Global Learning");
        c2.displayCourseDetails();
    }
}
