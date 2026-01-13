package objectorientedprogramming.classandobject.level2;
import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(int qty) {
        quantity += qty;
    }

    void removeItem(int qty) {
        if (qty <= quantity)
            quantity -= qty;
    }

    void displayTotalCost() {
        System.out.println(price * quantity);
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CartItem item = new CartItem();

        item.itemName = sc.nextLine();
        item.price = sc.nextDouble();
        item.quantity = sc.nextInt();

        item.addItem(sc.nextInt());
        item.removeItem(sc.nextInt());
        item.displayTotalCost();
    }
}
