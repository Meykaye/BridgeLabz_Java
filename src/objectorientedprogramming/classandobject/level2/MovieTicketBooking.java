package objectorientedprogramming.classandobject.level2;
import java.util.Scanner;

class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    void bookTicket(int seat, double cost) {
        seatNumber = seat;
        price = cost;
    }

    void displayTicket() {
        System.out.println(movieName);
        System.out.println(seatNumber);
        System.out.println(price);
    }
}

public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieTicket ticket = new MovieTicket();

        ticket.movieName = sc.nextLine();
        int seat = sc.nextInt();
        double cost = sc.nextDouble();

        ticket.bookTicket(seat, cost);
        ticket.displayTicket();
    }
}
