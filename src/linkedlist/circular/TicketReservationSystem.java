package linkedlist.circular;
/*
 * Online Ticket Reservation using Circular Linked List
 */
class TicketNode {
    int ticketId;
    String customer, movie;
    TicketNode next;

    TicketNode(int id, String customer, String movie) {
        this.ticketId = id;
        this.customer = customer;
        this.movie = movie;
    }
}

public class TicketReservationSystem {

    private TicketNode head;

    public void bookTicket(int id, String customer, String movie) {
        TicketNode newNode = new TicketNode(id, customer, movie);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        TicketNode temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = newNode;
        newNode.next = head;
    }

    public void displayTickets() {
        if (head == null) return;
        TicketNode temp = head;
        do {
            System.out.println(temp.ticketId + " | " + temp.customer + " | " + temp.movie);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        TicketReservationSystem trs = new TicketReservationSystem();
        trs.bookTicket(1, "John", "Inception");
        trs.bookTicket(2, "Emma", "Avatar");
        trs.displayTickets();
    }
}
