package objectorientedprogramming.objectorienteddesignprinciples;
import java.util.ArrayList;

class Product {
    String name;

    Product(String name) {
        this.name = name;
    }
}

class Order {
    ArrayList<Product> products = new ArrayList<>();

    void addProduct(Product p) {
        products.add(p);
    }
}

class EcommerceCustomer {
    String name;

    EcommerceCustomer(String name) {
        this.name = name;
    }

    void placeOrder(Order o) {
        System.out.println(name + " placed an order");
    }

    public static void main(String[] args) {
        EcommerceCustomer c = new EcommerceCustomer("Amit");
        Order o = new Order();
        o.addProduct(new Product("Laptop"));

        c.placeOrder(o);
    }
}
