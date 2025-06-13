import java.util.*;


class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(id + " | " + name + " | Rs" + price);
    }
}


class Customer {
    String name;
    List<Product> cart = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void addToCart(Product pr) {
        cart.add(pr);
        System.out.println(pr.name + " added to cart.");
    }

    void showCart() {
        System.out.println("\n" + name + "'s Shopping Cart:");
        double total = 0;
        for (Product p : cart) {
            System.out.println("- " + p.name + " : Rs" + p.price);
            total += p.price;
        }
        System.out.println("Total: Rs" + total);
    }
}


public class OnlineShoppingWeb {
    public static void main(String[] args) {
        // Products
        Product p1 = new Product(101, "Laptop", 50000);
        Product p2 = new Product(102, "Smartphone", 15000);
        Product p3 = new Product(103, "Headphones", 2000);

        // Display available products
        System.out.println("Available Products:");
        p1.display();
        p2.display();
        p3.display();

        // Customer
        Customer c1 = new Customer("Alice");

        // Adding products to cart
        c1.addToCart(p1);
        c1.addToCart(p3);

        // Show cart details
        c1.showCart();
    }
}
