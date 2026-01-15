package objectorientedprogramming.constructors.level1;

public class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed");
        } else {
            System.out.println("Book not available");
        }
    }

    public static void main(String[] args) {
        LibraryBook book = new LibraryBook("Data Structures", "Mark", 650);
        book.borrowBook();
        book.borrowBook();
    }
}