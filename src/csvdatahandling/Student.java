package csvdatahandling;

public class Student {
    public String id;
    public String name;
    public int age;
    public double marks;

    public Student(String id, String name, int age, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Age: " + age +
                ", Marks: " + marks;
    }
}
