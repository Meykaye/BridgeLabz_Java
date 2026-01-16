package objectorientedprogramming.classandobject.level1;
import java.util.Scanner;

/**
 * Employee class stores employee information
 */
class Employee {
    String name;      // Employee's name
    int id;           // Unique employee ID
    double salary;    // Employee's salary

    /**
     * Displays all employee details including name, ID, and salary
     */
    void displayDetails() {
        System.out.println(name);
        System.out.println(id);
        System.out.println(salary);
    }
}

public class EmployeeDetails {
    /**
     * Main method to demonstrate Employee class functionality
     * Reads employee information and displays it
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();

        // Read employee information from user
        e.name = sc.nextLine();
        e.id = sc.nextInt();
        e.salary = sc.nextDouble();

        // Display the employee details
        e.displayDetails();
        sc.close();
    }
}
