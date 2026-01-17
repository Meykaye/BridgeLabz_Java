package linkedlist.circular;
import java.util.Scanner;

/*
 * Task Scheduler using Circular Linked List
 */
class TaskNode {
    int taskId, priority;
    String taskName, dueDate;
    TaskNode next;

    TaskNode(int id, String name, int priority, String dueDate) {
        this.taskId = id;
        this.taskName = name;
        this.priority = priority;
        this.dueDate = dueDate;
    }
}

public class TaskCircularLinkedList {

    private TaskNode head, current;

    public void addTask(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            current = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = newNode;
        newNode.next = head;
    }

    public void viewNextTask() {
        if (current != null) {
            System.out.println("Task: " + current.taskName + " Priority: " + current.priority);
            current = current.next;
        }
    }

    public void displayTasks() {
        if (head == null) return;

        TaskNode temp = head;
        do {
            System.out.println(temp.taskId + " | " + temp.taskName + " | " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }

    /* ---------------- MAIN METHOD ---------------- */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskCircularLinkedList list = new TaskCircularLinkedList();
        int choice;

        do {
            System.out.println("\n1.Add Task  2.View Next Task  3.Display Tasks  0.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("ID Name Priority DueDate: ");
                    list.addTask(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
                    break;
                case 2:
                    list.viewNextTask();
                    break;
                case 3:
                    list.displayTasks();
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}
