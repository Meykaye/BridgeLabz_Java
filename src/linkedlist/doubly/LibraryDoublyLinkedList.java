package linkedlist.doubly;
import java.util.Scanner;

/*
 * Library Management System using Doubly Linked List
 */
class BookNode {
    int bookId;
    String title, author, genre;
    boolean available;
    BookNode next, prev;

    BookNode(int id, String title, String author, String genre) {
        this.bookId = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = true;
    }
}

public class LibraryDoublyLinkedList {

    private BookNode head, tail;

    public void addBook(int id, String title, String author, String genre) {
        BookNode newNode = new BookNode(id, title, author, genre);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void removeBook(int id) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                if (temp == head) head = temp.next;
                if (temp == tail) tail = temp.prev;
                if (temp.prev != null) temp.prev.next = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found.");
    }

    public void displayForward() {
        BookNode temp = head;
        while (temp != null) {
            System.out.println(temp.bookId + " | " + temp.title + " | " + temp.author +
                    " | Available: " + temp.available);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        BookNode temp = tail;
        while (temp != null) {
            System.out.println(temp.bookId + " | " + temp.title);
            temp = temp.prev;
        }
    }

    /* ---------------- MAIN METHOD ---------------- */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryDoublyLinkedList list = new LibraryDoublyLinkedList();
        int choice;

        do {
            System.out.println("\n1.Add 2.Remove 3.Display 4.Reverse 0.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    list.addBook(sc.nextInt(), sc.next(), sc.next(), sc.next());
                    break;
                case 2:
                    list.removeBook(sc.nextInt());
                    break;
                case 3:
                    list.displayForward();
                    break;
                case 4:
                    list.displayReverse();
            }
        } while (choice != 0);
        sc.close();
    }
}
