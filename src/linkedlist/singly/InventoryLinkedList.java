package linkedlist.singly;
import java.util.Scanner;

/*
 * Inventory Management System using Singly Linked List
 */
class InventoryNode {
    int itemId, quantity;
    String itemName;
    double price;
    InventoryNode next;

    InventoryNode(int id, String name, int qty, double price) {
        this.itemId = id;
        this.itemName = name;
        this.quantity = qty;
        this.price = price;
        this.next = null;
    }
}

public class InventoryLinkedList {

    private InventoryNode head;

    /* Add item at end */
    public void addItem(int id, String name, int qty, double price) {
        InventoryNode newNode = new InventoryNode(id, name, qty, price);
        if (head == null) {
            head = newNode;
            return;
        }
        InventoryNode temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    /* Remove item by ID */
    public void removeItem(int id) {
        if (head == null) return;

        if (head.itemId == id) {
            head = head.next;
            return;
        }

        InventoryNode temp = head;
        while (temp.next != null && temp.next.itemId != id)
            temp = temp.next;

        if (temp.next != null)
            temp.next = temp.next.next;
        else
            System.out.println("Item not found.");
    }

    /* Update quantity */
    public void updateQuantity(int id, int qty) {
        InventoryNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                temp.quantity = qty;
                System.out.println("Quantity updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    /* Search item */
    public void searchItem(int id) {
        InventoryNode temp = head;
        while (temp != null) {
            if (temp.itemId == id) {
                System.out.println(temp.itemName + " | Qty: " + temp.quantity + " | Price: " + temp.price);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    /* Total inventory value */
    public void totalValue() {
        double total = 0;
        InventoryNode temp = head;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: " + total);
    }

    /* Display items */
    public void display() {
        InventoryNode temp = head;
        while (temp != null) {
            System.out.println(temp.itemId + " | " + temp.itemName + " | " +
                    temp.quantity + " | " + temp.price);
            temp = temp.next;
        }
    }

    /* ---------------- MAIN METHOD ---------------- */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InventoryLinkedList list = new InventoryLinkedList();
        int choice;

        do {
            System.out.println("\n1.Add 2.Remove 3.Update Qty 4.Search 5.Total Value 6.Display 0.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    list.addItem(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextDouble());
                    break;
                case 2:
                    list.removeItem(sc.nextInt());
                    break;
                case 3:
                    list.updateQuantity(sc.nextInt(), sc.nextInt());
                    break;
                case 4:
                    list.searchItem(sc.nextInt());
                    break;
                case 5:
                    list.totalValue();
                    break;
                case 6:
                    list.display();
            }
        } while (choice != 0);
        sc.close();
    }
}
