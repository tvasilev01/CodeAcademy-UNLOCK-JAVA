package week8.task6;

import java.util.List;
import java.util.Scanner;

public class PhoneBookTest {
    public static final Scanner scanner = new Scanner(System.in);
    private static final PhoneBook phoneBook = new PhoneBook();

    public static void main(String[] args) {
        /*
        Създайте клас PhoneBook който има списък List< String> data, който съдържа низове със следния формат: “име-номер”.
        Напишете следните методи в класа PhoneBook
        void insert – получава име и номер и ги добавя в списъка, но ако съществува запис с такъв номер го трие и на негово място слага новия запис.
        boolean deleteByPhoneNumber – изтрива запис по номер, връща false ако няма такъв запис, а true когато намери такъв запис и го изтрие.
        getAllNamesStartingWith – връща всички записи за които имената започват с даден низ
        toString – връща низ съдържащ всички записи, като всеки запис е на нов ред
        Създайте PhoneBookTest клас който:
        Показва следното меню в конзолата:
        Изберете опция:
            -Добави нов запис
            -Изтрий запис по номер
            -Покажи всички записи които започват с низ
            -Принтирай toString
            -Изход
        При избор на 1, показва “Въведете име:” и прочита въведеното име.
        После показва “Въведете телефонен номер:” и прочита въведения номер. Ако съществува запис за този номер, принтира “Запис за този номер съществува вече.
        Изберете 1, за да бъде презаписан или 0, за да се върнете към началното меню.”.
        Прочита избраната опция. При 1 – добавя записа във phoneBook-a, а при 0 – отново извежда менюто. (помислете какво да изведете при невалиден избор).
        Ако пък не съществува запис за този номера, тогава просто принтира “Записът се въвежда…” и въвежда записа.
        На края принтира “Изберете следваща опция” и чака за следващия избор на потребителя.
        При избор на 2 показва “Въведете телефонния номер за който искате да бъде изтрит записът.” и прочита въведения номер.
        В зависимост от това дали записът е бил успешно изтрит или не принтира “Записът беше успешно изтрит.” или “Запис за този номер не беше намерен.”
        Накрая принтира “Изберете следваща опция” и чака за следващия избор на потребителя.
        При избор на 3 показва “Въведете низ.” и прочита въведния низ.
        Принтира “Всички записи, които започват с <въведния низ> са следните: <брой записи>” Принтира “Изберете следваща опция” и чака за следващия избор на потребителя.
        При избор 4 принтира toString-а и след това принтира “Изберете следваща опция” и чака за следващия избор на потребителя.
        Hint: Помислете да изкарате в методи кода, който се налага да използвате повече от веднъж (ако има такъв).
        Hint: Не забравяйте да валидирате входните данни.
        Hint: Как ще се държи програмата ви когато данните в списъка свършат?

        Валидации: Телефонните номера трябва да имат следният формат :
        +359878123456 или 0878123456 (0 замества +359) или 00359878123456
        (00 замества +) Уточнения: +359 е международният код на България
        Следващите 2 цифри са код на мобилният оператор и може само да приемат следните стойности
        – 87, 88 или 89 Следващата цифра след код на мобилен оператор трябва да е между 2-9
        Останалите 6 цифри могат да бъдат между 0-9 N.B – мобилните номера, които не отговарят на валидацията не трябва да се записват

        2. PhoneBook
            -Валидирайте, че дължината на името е максимум 26 символа. Валидирайте и телефонния номер – може да потърсите в интернет регулярен израз. Ако горните данни са невалидни нека се получава IllegalArgumentException.
        3. При добавянето на запис – ако имате повече от 100 записа тогава да се получава PhoneBookFullExcepition (трябва да създадете класът PhoneBookFullExcepition, помислете да е checked или unchecked exception).
        4. При триенето на запис да се връща EntryNotFoundException (трябва да създадете класът EntryNotFoundException, помислете да е checked или unchecked exception).
        5. При покажи всички записи които започват с низ – ако няма записи които започват с даден низ да се получава EntryNotFoundException (трябва да създадете класът EntryNotFoundException, помислете да е checked или unchecked exception)

         */


        while (true) {
            showMenu();
            int choice = getChoice();
            processChoice(choice);

        }
    }

    private static void showMenu() {
        System.out.println("Изберете опция:");
        System.out.println("1. Добави нов запис");
        System.out.println("2. Изтрий запис по номер");
        System.out.println("3. Покажи всички записи които започват с низ");
        System.out.println("4. Принтирай toString()");
        System.out.println("5. Изход");
    }

    public static int getChoice() {
        int choice = 0;
        try {
            System.out.println("Въведете избраната опция: ");
            choice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Невалиден избор. Моля, въведете число.");
        }
        return choice;
    }

    private static void processChoice(int choice) {
        switch (choice) {
            case 1:
                addNewRecord();
                break;
            case 2:
                deleteRecordByPhoneNumber();
                break;
            case 3:
                showRecordsByPrefix();
                break;
            case 4:
                System.out.println(phoneBook.toString());
                break;
            case 5:
                System.out.println("Изход.");
                System.exit(0);
            default:
                System.out.println("Невалиден избор. Моля, опитайте отново.");
        }
    }

    private static void addNewRecord() {
        System.out.print("Въведете име: ");
        String name = scanner.nextLine();
        System.out.print("Въведете телефонен номер: ");
        String phoneNumber = scanner.nextLine();

        try {
            phoneBook.insert(name, phoneNumber);
            System.out.println("Записът беше успешно добавен.");
        }catch (PhoneBookFullException e){
            System.out.println("Грешка: " + e.getMessage());
        }
    }

    private static void deleteRecordByPhoneNumber() {
        System.out.print("Въведете телефонния номер за който искате да бъде изтрит записът: ");
        String deleteNumber = scanner.nextLine();
        try {
            if (phoneBook.deleteByPhoneNumber(deleteNumber)) {
                System.out.println("Записът беше успешно изтрит.");
            } else {
                System.out.println("Записът за този номер не беше намерен.");
            }
        }catch (EntryNotFoundException e){
            System.out.println("Грешка: " + e.getMessage());
        }
    }

    private static void showRecordsByPrefix() {
        System.out.print("Въведете низ: ");
        String prefix = scanner.nextLine();
        try {
            List<String> matchingEntries = phoneBook.getAllNamesStartingWith(prefix);
            System.out.println("Всички записи, които започват с " + prefix + " са следните: " + matchingEntries.size());
        } catch (EntryNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
