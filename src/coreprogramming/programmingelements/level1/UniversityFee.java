package coreprogramming.programmingelements.level1;

// This class calculates discounted fee for university education
public class UniversityFee {
    public static void main(String[] args) {
        double fee = 125000;
        double discountPercent = 10;

        // Calculate discount amount and final fee after applying discount
        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        System.out.println(
                "The discount amount is INR " + discount +
                        " and final discounted fee is INR " + finalFee
        );
    }
}

