package objectorientedprogramming.constructors.accessmodifiers;

public class BankAccount {
    public long accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(long accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(555001, "Neha", 25000);
        sa.displayAccountInfo();
        sa.setBalance(30000);
        System.out.println(sa.getBalance());
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(long accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    void displayAccountInfo() {
        System.out.println(accountNumber + " " + accountHolder);
    }
}