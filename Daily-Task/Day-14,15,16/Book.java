public class Book {
    String title;
    String author;
    double price;

    Book(String title, String author,double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void displayDetails(){
     System.out.println("Title: "+ title);
       System.out.println("Author: "+ author);
       System.out.println("Price: Rs "+ price);
   }
}

class BookCreate{
    public static void main(String[] args) {
        Book book1 = new Book("Wings of Fire", "A.P.J Abdul Kalam", 250.75);
        Book book2 = new Book("The Alchemist", "Paulo Coelho", 349.99);
        Book book3 = new Book("Clean Code", "Robert C. Martin", 599.00);

        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
    }
}
