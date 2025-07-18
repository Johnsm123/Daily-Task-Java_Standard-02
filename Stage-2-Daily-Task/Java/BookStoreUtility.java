import java.util.*;
import java.util.stream.*;

public class BookStoreUtility {
    private List<Book> bookList = new ArrayList<>();

    public BookStoreUtility() {
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void addBook(Book bookObj) {
        bookList.add(bookObj);
    }

    public int calculateTotalPurchaseCost(Stream<Book> bookStream) {
        return bookStream.mapToInt(Book::getPrice).sum();
    }
}
