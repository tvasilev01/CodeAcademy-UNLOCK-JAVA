package week5.task2;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private int pages;
    private String publisher;
    private double price;

    private static int bookCount = 0;

    public Book(String title, String author, String isbn, int pages, String publisher, double price){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;
        this.publisher = publisher;
        this.price = price;
        bookCount++;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", pages=" + pages +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                '}';
    }

    public static int getBookCount() {
        return bookCount;
    }
}
