package objectorientedprogramming.classandobject.level2;
import java.util.Scanner;

class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }

    void displayBalance() {
        System.out.println(balance);
    }
}

public class AtmSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();

        acc.accountHolder = sc.nextLine();
        acc.accountNumber = sc.nextInt();
        acc.balance = sc.nextDouble();

        acc.deposit(sc.nextDouble());
        acc.withdraw(sc.nextDouble());
        acc.displayBalance();
    }
}
