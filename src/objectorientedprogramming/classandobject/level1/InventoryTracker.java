package objectorientedprogramming.classandobject.level1;
import java.util.Scanner;

/**
 * Item class stores item details for inventory
 */
class Item {
class Item {
    int itemCode;      // Unique code identifying the item
    String itemName;   // Name of the item
    double price;      // Unit price of the item

    /**
     * Calculates total cost by multiplying price with quantity
     */
    double totalCost(int quantity) {
        return price * quantity;
    }

    /**
     * Displays item details along with total cost for given quantity
     */
    void displayItem(int quantity) {
        System.out.println(itemCode);
        System.out.println(itemName);
        System.out.println(price);
        System.out.println(totalCost(quantity));
    }
}

public class InventoryTracker {
    /**
     * Main method to demonstrate inventory tracking functionality
     * Reads item details and quantity, calculates total cost
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item item = new Item();

        // Read item information and quantity from user
        item.itemCode = sc.nextInt();
        sc.nextLine();  // Consume newline
        item.itemName = sc.nextLine();
        item.price = sc.nextDouble();
        int quantity = sc.nextInt();

        // Display item details with total cost calculation
        item.displayItem(quantity);
        sc.close();
    }
}
