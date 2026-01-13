package objectorientedprogramming.classandobject.level1;
import java.util.Scanner;

class Employee {
    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println(name);
        System.out.println(id);
        System.out.println(salary);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();

        e.name = sc.nextLine();
        e.id = sc.nextInt();
        e.salary = sc.nextDouble();

        e.displayDetails();
    }
}
