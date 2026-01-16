package objectorientedprogramming.classandobject.level2;
import java.util.Scanner;

/**
 * BankAccount class manages account balance
 * Can deposit and withdraw money
 */
class BankAccount {
    String accountHolder;  // Name of the account holder
    int accountNumber;     // Unique account number
    double balance;        // Current account balance

    /**
     * Adds money to the account
     */
    void deposit(double amount) {
        balance += amount;
    }

    /**
     * Removes money from the account if enough balance exists
     */
    void withdraw(double amount) {
        // Check if enough balance exists before withdrawing
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }

    /**
     * Displays the current balance in the account
     */
    void displayBalance() {
        System.out.println(balance);
    }
}

public class AtmSimulation {
    /**
     * Main method to simulate ATM operations
     * Performs deposit and withdrawal operations on a bank account
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();

        // Read account information
        acc.accountHolder = sc.nextLine();
        acc.accountNumber = sc.nextInt();
        acc.balance = sc.nextDouble();

        // Perform deposit operation
        acc.deposit(sc.nextDouble());
        
        // Perform withdrawal operation
        acc.withdraw(sc.nextDouble());
        
        // Display final balance
        acc.displayBalance();
        sc.close();
    }
}
