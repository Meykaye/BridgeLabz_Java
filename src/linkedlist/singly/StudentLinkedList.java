package linkedlist.singly;
import java.util.Scanner;

/*
 * Student Record Management using Singly Linked List
 */
class StudentNode {
    int rollNumber;
    String name;
    int age;
    char grade;
    StudentNode next;

    StudentNode(int rollNumber, String name, int age, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

public class StudentLinkedList {

    private StudentNode head;

    public void insertAtBeginning(int roll, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int roll, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);

        if (head == null) {
            head = newNode;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    public void deleteByRollNumber(int roll) {
        if (head == null) return;

        if (head.rollNumber == roll) {
            head = head.next;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNumber != roll)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
        else
            System.out.println("Student not found.");
    }

    public void searchByRollNumber(int roll) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNumber == roll) {
                System.out.println("Found: " + temp.name + ", Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }

    public void updateGrade(int roll, char grade) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNumber == roll) {
                temp.grade = grade;
                System.out.println("Grade updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found.");
    }

    public void displayStudents() {
        StudentNode temp = head;
        while (temp != null) {
            System.out.println(temp.rollNumber + " | " + temp.name + " | " + temp.age + " | " + temp.grade);
            temp = temp.next;
        }
    }

    /* ---------------- MAIN METHOD ---------------- */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentLinkedList list = new StudentLinkedList();
        int choice;

        do {
            System.out.println("\n1.Add Student  2.Delete  3.Search  4.Update Grade  5.Display  0.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Roll Name Age Grade: ");
                    list.insertAtEnd(sc.nextInt(), sc.next(), sc.nextInt(), sc.next().charAt(0));
                    break;
                case 2:
                    System.out.print("Enter Roll: ");
                    list.deleteByRollNumber(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Enter Roll: ");
                    list.searchByRollNumber(sc.nextInt());
                    break;
                case 4:
                    System.out.print("Enter Roll and New Grade: ");
                    list.updateGrade(sc.nextInt(), sc.next().charAt(0));
                    break;
                case 5:
                    list.displayStudents();
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}
