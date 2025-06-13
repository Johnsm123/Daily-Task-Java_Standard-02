package Books;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private double price;
    private int year;

    public Book(String title, String author, double price, int year) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }
}
    class Main {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Java Basics", "John Doe", 29.99, 2014),
                new Book("Advanced Java", "Jane Smith", 49.99, 2016),
                new Book("Python Guide", "Alice Brown", 39.99, 2018),
                new Book("Data Structures", "Bob Johnson", 59.99, 2017)
        );

        // Filter books published after 2015
        System.out.println("Books published after 2015:");
        books.stream()
                .filter(book -> book.getYear() > 2015)
                .forEach(book -> System.out.println(book.getTitle() + " (" + book.getYear() + ")"));

        // Find the most expensive book
        Book mostExpensive = books.stream()
                .max(Comparator.comparingDouble(Book::getPrice))
                .orElse(null);
        System.out.println("\nMost expensive book: " + (mostExpensive != null ? mostExpensive.getTitle() + " ($" + mostExpensive.getPrice() + ")" : "None"));

        // List titles in alphabetical order
        System.out.println("\nTitles in alphabetical order:");
        books.stream()
                .map(Book::getTitle)
                .sorted()
                .forEach(System.out::println);
    }
}
