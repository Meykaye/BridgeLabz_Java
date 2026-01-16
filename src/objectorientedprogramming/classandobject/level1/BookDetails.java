package objectorientedprogramming.classandobject.level1;
import java.util.Scanner;

/**
 * Book class represents a book with its basic attributes.
 * This class encapsulates book information such as title, author, and price.
 */
class Book {
    String title;     // Name of the book
    String author;    // Author of the book
    double price;     // Price of the book

    /**
     * Displays all book details to the console
     */
    void displayDetails() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
    }
}

public class BookDetails {
    /**
     * Main method to demonstrate Book class functionality
     * Reads book details from user input and displays them
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b = new Book();

        // Read book information from user
        b.title = sc.nextLine();
        b.author = sc.nextLine();
        b.price = sc.nextDouble();

        // Display the book details
        b.displayDetails();        sc.close();    }
}
