package objectorientedprogramming.constructors.accessmodifiers;

public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Manager m = new Manager(9001, "IT", 80000);
        m.displayManagerInfo();
        m.setSalary(95000);
        System.out.println(m.getSalary());
    }
}

class Manager extends Employee {
    Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    void displayManagerInfo() {
        System.out.println(employeeID + " " + department);
    }
}