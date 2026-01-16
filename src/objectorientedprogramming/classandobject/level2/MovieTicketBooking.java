package objectorientedprogramming.classandobject.level2;
import java.util.Scanner;

/**
 * MovieTicket class stores ticket information for a movie
 */
class MovieTicket {
    String movieName;   // Name of the movie
    int seatNumber;     // Seat number for the ticket
    double price;       // Price of the ticket

    /**
     * Books a ticket with seat number and price
     */
    void bookTicket(int seat, double cost) {
        seatNumber = seat;
        price = cost;
    }

    /**
     * Displays all ticket details to the console
     */
    void displayTicket() {
        System.out.println(movieName);
        System.out.println(seatNumber);
        System.out.println(price);
    }
}

public class MovieTicketBooking {
    /**
     * Main method to demonstrate movie ticket booking functionality
     * Books a ticket and displays the booking details
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieTicket ticket = new MovieTicket();

        // Read movie name and ticket details
        ticket.movieName = sc.nextLine();
        int seat = sc.nextInt();
        double cost = sc.nextDouble();

        // Book the ticket with seat and cost information
        ticket.bookTicket(seat, cost);
        
        // Display booked ticket details
        ticket.displayTicket();
        sc.close();
    }
}
