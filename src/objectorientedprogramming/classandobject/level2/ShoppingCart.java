package objectorientedprogramming.classandobject.level2;
import java.util.Scanner;

/**
 * CartItem class represents an item in a shopping cart
 */
class CartItem {
    String itemName;    // Name of the item
    double price;       // Price per unit of the item
    int quantity;       // Current quantity in cart

    /**
     * Adds items to the cart
     */
    void addItem(int qty) {
        quantity += qty;
    }

    /**
     * Removes items from the cart if available
     */
    void removeItem(int qty) {
        // Only remove if enough quantity exists
        if (qty <= quantity)
            quantity -= qty;
    }

    /**
     * Displays total cost of the item (price * quantity)
     */
    void displayTotalCost() {
        System.out.println(price * quantity);
    }
}

public class ShoppingCart {
    /**
     * Main method to demonstrate shopping cart operations
     * Adds and removes items, displays final total cost
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CartItem item = new CartItem();

        // Read initial item details
        item.itemName = sc.nextLine();
        item.price = sc.nextDouble();
        item.quantity = sc.nextInt();

        // Add items to cart
        item.addItem(sc.nextInt());
        
        // Remove items from cart
        item.removeItem(sc.nextInt());
        
        // Display total cost for this item
        item.displayTotalCost();
        sc.close();
    }
}
