package objectorientedprogramming.constructors.accessmodifiers;

public class Book {
    public String ISBN;
    protected String title;
    private String author;

    Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public static void main(String[] args) {
        EBook eb = new EBook("978-21", "Java Programming", "John", "PDF");
        eb.displayEBookDetails();
        eb.setAuthor("David");
        System.out.println(eb.getAuthor());
    }
}

class EBook extends Book {
    String format;

    EBook(String ISBN, String title, String author, String format) {
        super(ISBN, title, author);
        this.format = format;
    }

    void displayEBookDetails() {
        System.out.println(ISBN + " " + title + " " + format);
    }
}