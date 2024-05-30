package week7.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        /*
        Създайте клас Book който има абстрактен метод display()
        Създайте клас MyBook който:
        2.1 Наследява Book
        2.2 Има конструктор с параметри title, author, price
        2.3 Имплементира display() т. че да той да извежда конзолата следният изход: Title: <title>. Author: <author>. Price: <price>.
        Създайте клас BookTest който чете книги от конзолата (преценете кога да спре четенето) и след това извежда книгите в конзолата.
         */
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        System.out.println("Enter book details (title, author, price). Enter 'stop' to finish:");

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.equalsIgnoreCase("stop")) {
                break;
            }

            System.out.print("Author: ");
            String author = scanner.nextLine();

            System.out.print("Price: ");
            double price = Double.parseDouble(scanner.nextLine());

            books.add(new MyBook(title, author, price));
        }

        System.out.println("\nBook details:");
        for (Book book : books) {
            book.display();
        }
    }
}
