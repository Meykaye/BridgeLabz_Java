package objectorientedprogramming.objectorienteddesignprinciples;
class Bank {
    String name;

    Bank(String name) {
        this.name = name;
    }

    void openAccount(Customer c) {
        System.out.println(c.name + " opened account in " + name);
    }
}

class Customer {
    String name;
    double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Bank bank = new Bank("ABC Bank");
        Customer c = new Customer("Ravi", 5000);

        bank.openAccount(c);
        c.viewBalance();
    }
}
