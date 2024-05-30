package week5.task2;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        /*
        Копирайте класа Book от предишната задача и направете следните промени в него:
        Добавете конструктор, който инициализира атрибутите.
        Добавете toString() метод който връща String, съдържащ атрибутите на класа, подходящо форматирани.
        Добавете и една статична константа която ще представлява брояч на книги. Копирайте BookTest класа като направите следните промени в него:
        Принтирайте меню на потребителя, където той може да избере 1. Да въведе книга или 2. Изход
        Книгите да се въвеждат от конзолата като използвате Scanner. (Валидирайте входните данни, за да избегнете грешки във вашата програма)
        При въвеждането на всяка книга тогава стойността на брояча се увеличава с 1.
        Когато потребителят избере Изход тогава в конзолата се отпечатва броя на всички книги и toString-а на всяка една от тях.
        */
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Меню");
            System.out.println("1. Въведи книга: ");
            System.out.println("2. Изход: ");
            System.out.print("Въведете вашия избор: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Невалиден вход. Моля въведете валиден избор.");
                scanner.next();
            }

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\nВъведете детайли за книгата: ");
                    System.out.print("Заглавие: ");
                    String title = scanner.nextLine();
                    System.out.print("Автор: ");
                    String author = scanner.nextLine();
                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("Страници: ");

                    while (!scanner.hasNextInt()) {
                        System.out.println("Невалиден вход. Моля въведете валидно число на страница.");
                        scanner.next();
                    }

                    int pages = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Издател: ");
                    String publisher = scanner.nextLine();
                    System.out.print("Цена: ");

                    while (!scanner.hasNextDouble()) {
                        System.out.println("Невалиден вход. Моля въведете валидна цена.");
                        scanner.next();
                    }

                    double price = scanner.nextDouble();
                    scanner.nextLine();

                    Book newBook = new Book(title, author, isbn, pages, publisher, price);
                    System.out.println("\nУспешно добавена книга. Общо книги: " + Book.getBookCount());
                    break;

                case 2:
                    System.out.println("\nИзлязохте от програмата.");
                    break;

                default:
                    System.out.println("Невалиден избор. Моля въведете валидна опция.");
                    break;
            }

        } while (choice != 2);

        System.out.println("Общ брой книги: " + Book.getBookCount());
    }
}
