package week5.task1;

public class BookTest {
    public static void main(String[] args) {
        /*
        Създайте клас Book който има следните атрибути:
        -Title
        -Author
        -ISBN
        -Pages
        -Publisher
        -Price
        Добавете Getters and Setter за всички атрибути.
        Създайте BookTest клас.
        В main метода създайте инстанция на клас Book (използвайки конструктора по подразбиране)
        Принтирайте всеки един от атрибутите в конзолата. (Забележете стойностите им по подразбиране!!!)
        Задайте стойности по ваш избор на всеки атрибут, използвайки неговия setter.
        Принтирайте пак всички атрибути. (Може да използвате статичен метод public static printAttributes(Book book), който да преизползвате всеки път като принтирате атрибутите)
         */
        Book book = new Book();

        System.out.println("Атрибути преди задаване на стойностите:");
        printAttributes(book);

        book.setTitle("Методът Virgin");
        book.setAuthor("Ричард Брансън");
        book.setIsbn("9789549696851");
        book.setPages(344);
        book.setPublisher("AMG Publishing");
        book.setPrice(18.0);

        System.out.println("\nАтрибути след задаване на стойностите: ");
        printAttributes(book);
    }

    public static void printAttributes(Book book){
        System.out.println("Заглавие: " + book.getTitle());
        System.out.println("Автор: " + book.getAuthor());
        System.out.println("ISBN: " + book.getIsbn());
        System.out.println("Страници: " + book.getPages());
        System.out.println("Издател: " + book.getPublisher());
        System.out.println("Цена: " + book.getPrice());
    }
}
