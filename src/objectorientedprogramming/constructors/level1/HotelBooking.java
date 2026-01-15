package objectorientedprogramming.constructors.level1;

public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    HotelBooking() {
        this("Guest", "Standard", 1);
    }

    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking(HotelBooking hb) {
        this.guestName = hb.guestName;
        this.roomType = hb.roomType;
        this.nights = hb.nights;
    }

    public static void main(String[] args) {
        HotelBooking h1 = new HotelBooking();
        HotelBooking h2 = new HotelBooking("John", "Deluxe", 3);
        HotelBooking h3 = new HotelBooking(h2);
        System.out.println(h3.guestName + " " + h3.roomType + " " + h3.nights);
    }
}
