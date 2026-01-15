package objectorientedprogramming.constructors.level1;

public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    CarRental() {
        this("Customer", "Sedan", 1);
    }

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return rentalDays * 1000;
    }

    public static void main(String[] args) {
        CarRental rental = new CarRental("Emma", "SUV", 5);
        System.out.println(rental.calculateTotalCost());
    }
}
