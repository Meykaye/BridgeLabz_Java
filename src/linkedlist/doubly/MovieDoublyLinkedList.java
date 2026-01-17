package linkedlist.doubly;
import java.util.Scanner;

/*
 * Movie Management System using Doubly Linked List
 */
class MovieNode {
    String title, director;
    int year;
    double rating;
    MovieNode next, prev;

    MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}

public class MovieDoublyLinkedList {

    private MovieNode head, tail;

    public void insertAtEnd(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void removeByTitle(String title) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                if (temp == head) head = temp.next;
                if (temp == tail) tail = temp.prev;
                if (temp.prev != null) temp.prev.next = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
                System.out.println("Movie removed.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found.");
    }

    public void displayForward() {
        MovieNode temp = head;
        while (temp != null) {
            System.out.println(temp.title + " | " + temp.director + " | " + temp.rating);
            temp = temp.next;
        }
    }

    /* ---------------- MAIN METHOD ---------------- */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieDoublyLinkedList list = new MovieDoublyLinkedList();
        int choice;

        do {
            System.out.println("\n1.Add Movie  2.Remove Movie  3.Display  0.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Title Director Year Rating: ");
                    list.insertAtEnd(sc.next(), sc.next(), sc.nextInt(), sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter Title: ");
                    list.removeByTitle(sc.next());
                    break;
                case 3:
                    list.displayForward();
                    break;
            }
        } while (choice != 0);

        sc.close();
    }
}
