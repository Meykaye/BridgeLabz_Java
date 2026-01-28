package objectorientedprogramming.objectorienteddesignprinciples;
import java.util.ArrayList;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}

class Department {
    String name;
    ArrayList<Employee> employees = new ArrayList<>();

    Department(String name) {
        this.name = name;
    }

    void addEmployee(String name) {
        employees.add(new Employee(name));
    }
}

class Company {
    String name;
    ArrayList<Department> departments = new ArrayList<>();

    Company(String name) {
        this.name = name;
    }

    void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public static void main(String[] args) {
        Company c = new Company("TechCorp");
        c.addDepartment("IT");
        c.departments.get(0).addEmployee("Alice");
    }
}
