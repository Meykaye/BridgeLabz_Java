import java.util.ArrayList;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class Library {
    String name;
    ArrayList<Book> books = new ArrayList<>();

    Library(String name) {
        this.name = name;
    }

    void addBook(Book book) {
        books.add(book);
    }

    void displayBooks() {
        System.out.println("Library: " + name);
        for (Book b : books)
            System.out.println(b.title + " by " + b.author);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java", "James");
        Book b2 = new Book("DSA", "Mark");

        Library l1 = new Library("Central");
        Library l2 = new Library("City");

        l1.addBook(b1);
        l1.addBook(b2);
        l2.addBook(b1);

        l1.displayBooks();
        l2.displayBooks();
    }
}
