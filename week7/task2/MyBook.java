package week7.task2;

class MyBook extends Book {

    MyBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    void display() {
        System.out.printf("Title: %s, Author: %s, Price: %.2f%n", title, author, price);
    }
}
