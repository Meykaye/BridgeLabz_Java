package objectorientedprogramming.classandobject.level1;
import java.util.Scanner;

class Item {
    int itemCode;
    String itemName;
    double price;

    double totalCost(int quantity) {
        return price * quantity;
    }

    void displayItem(int quantity) {
        System.out.println(itemCode);
        System.out.println(itemName);
        System.out.println(price);
        System.out.println(totalCost(quantity));
    }
}

public class InventoryTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item item = new Item();

        item.itemCode = sc.nextInt();
        sc.nextLine();
        item.itemName = sc.nextLine();
        item.price = sc.nextDouble();
        int quantity = sc.nextInt();

        item.displayItem(quantity);
    }
}
