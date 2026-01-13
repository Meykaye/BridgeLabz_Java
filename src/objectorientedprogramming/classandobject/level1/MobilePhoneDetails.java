package objectorientedprogramming.classandobject.level1;
import java.util.Scanner;

class MobilePhone {
    String brand;
    String model;
    double price;

    void displayDetails() {
        System.out.println(brand);
        System.out.println(model);
        System.out.println(price);
    }
}

public class MobilePhoneDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MobilePhone phone = new MobilePhone();

        phone.brand = sc.nextLine();
        phone.model = sc.nextLine();
        phone.price = sc.nextDouble();

        phone.displayDetails();
    }
}
