package objectorientedprogramming.classandobject.level1;
import java.util.Scanner;

class Book {
    String title;
    String author;
    double price;

    void displayDetails() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b = new Book();

        b.title = sc.nextLine();
        b.author = sc.nextLine();
        b.price = sc.nextDouble();

        b.displayDetails();
    }
}
