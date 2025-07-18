import java.util.*;
import java.util.stream.*;
public class UserInterfaceStore {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            BookStoreUtility bookStore = new BookStoreUtility();

            while (true) {
                System.out.println("Select an option:");
                System.out.println("1.Add Books");
                System.out.println("2.Calculate Purchase Cost");
                System.out.println("3.Exit");

                int option = Integer.parseInt(sc.nextLine());

                switch (option) {
                    case 1:
                        System.out.println("Enter the book title");
                        String title = sc.nextLine();

                        System.out.println("Enter the author name");
                        String author = sc.nextLine();

                        System.out.println("Enter the book price");
                        int price = Integer.parseInt(sc.nextLine());

                        Book newBook = new Book(title, author, price);
                        bookStore.addBook(newBook);
                        break;

                    case 2:
                        // ✅ Required Option 2 logic
                        List<Book> books = bookStore.getBookList();
                        if (books.isEmpty()) {
                            System.out.println("There are no books available. Try to add books");
                        } else {
                            Stream<Book> bookStream = books.stream();
                            int totalCost = bookStore.calculateTotalPurchaseCost(bookStream);
                            System.out.println("The total purchase cost is Rs " + totalCost);
                        }
                        break;

                    case 3:
                        System.out.println("Thank you!!!");
                        return;

                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        }
    }


