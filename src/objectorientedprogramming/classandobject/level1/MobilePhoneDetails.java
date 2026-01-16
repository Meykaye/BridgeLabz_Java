package objectorientedprogramming.classandobject.level1;
import java.util.Scanner;

/**
 * MobilePhone class stores phone details like brand, model, and price
 */
class MobilePhone {
    String brand;    // Brand/manufacturer of the phone
    String model;    // Model name of the phone
    double price;    // Price of the phone

    /**
     * Displays all mobile phone details to the console
     */
    void displayDetails() {
        System.out.println(brand);
        System.out.println(model);
        System.out.println(price);
    }
}

public class MobilePhoneDetails {
    /**
     * Main method to demonstrate MobilePhone class functionality
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MobilePhone phone = new MobilePhone();

        // Read mobile phone information from user
        phone.brand = sc.nextLine();
        phone.model = sc.nextLine();
        phone.price = sc.nextDouble();

        // Display the mobile phone details
        phone.displayDetails();
        sc.close();
    }
}
