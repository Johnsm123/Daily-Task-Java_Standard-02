import java.util.*;
import java.util.stream.Collectors;

      class Products {
        String name;
        double price;
        String category;

        public Products(String name, double price, String category) {
            this.name = name;
            this.price = price;
            this.category = category;
        }

        public String getName() { return name; }
        public double getPrice() { return price; }
        public String getCategory() { return category; }
    }

        class Mainss {
        public static void main(String[] args) {
            List<Products> products = Arrays.asList(
                    new Products("Laptop", 45000, "Electronics"),
                    new Products("Mouse", 499, "Electronics"),
                    new Products("Shirt", 799, "Clothing"),
                    new Products("Headphones", 2999, "Electronics"),
                    new Products("Socks", 199, "Clothing"),
                    new Products("Phone", 25000, "Electronics")
            );

            // Filter products under ₹500
            System.out.println("Products under ₹500:");
            products.stream()
                    .filter(p -> p.getPrice() < 500)
                    .forEach(p -> System.out.println(p.getName() + ": ₹" + p.getPrice()));

            // Get names of products in "Electronics" category
            System.out.println("\nElectronics products:");
            List<String> electronics = products.stream()
                    .filter(p -> p.getCategory().equals("Electronics"))
                    .map(Products::getName)
                    .collect(Collectors.toList());
            System.out.println(electronics);

            // Print all product names sorted by price
            System.out.println("\nProducts sorted by price:");
            products.stream()
                    .sorted(Comparator.comparingDouble(Products::getPrice))
                    .map(Products::getName)
                    .forEach(System.out::println);
        }
    }

