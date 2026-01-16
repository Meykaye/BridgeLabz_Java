package coreprogramming.programmingelements.level1;
import java.util.Scanner;

// Program to calculate discounted university fee based on user input
public class UniversityFeeInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read the original fee and discount percentage from user
        double fee = input.nextDouble();
        double discountPercent = input.nextDouble();

        // Calculate discount amount and final fee after applying discount
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);

        input.close();
    }
}

