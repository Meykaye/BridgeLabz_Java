package coreprogramming.programmingelements.level2;
import java.util.Scanner;

// Program to calculate total purchase price by multiplying unit price and quantity
public class TotalPurchase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double unitPrice = input.nextDouble();
        int quantity = input.nextInt();

        // Calculate total purchase price
        double totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
        input.close();
    }
}

