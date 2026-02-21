package csvdatahandling;

public class Employee {
    public String id;
    public String name;
    public String department;
    public double salary;

    public Employee(String id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Department: " + department +
                ", Salary: " + salary;
    }
}
