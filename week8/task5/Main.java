package week8.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Създайте клас Circle който има зададен радиус и цвят от тип enum Color с цветовете жълт, зелен, син, червен.
            Класът има default constructor където за радиус се задава стойност 1.0, а цветът се избира случайно измежду възможните.
            Класът имa конструктор който получава радиус и цвят като аргументи и ги инициализира.
            Добавете Getters and Setters
            Добавете метод getArea() – смята лицето на кръга
            Добавете метод getCircumference – смята обиколката на кръга
            Добавете метод makeMeMoon() – оцветява кръга в жълто
            Добавете метод toString() – създава следния текст:
            Кръг с радиус <СТОЙНОСТ> и диаметър <СТОЙНОСТ>.
            Периметър: <СТОЙНОСТ>
            Лице: <СТОЙНОСТ>
            Цвят: <СТОЙНОСТ>
            Съдайте клас Main който при стартиране показва:
            Принтира “Въведете дължина на радиус или 0 за радиус по подразбиране [1.0]:” и чака вход
            Принтира “Изберете цвят [1 за жълт, 2 за червен, 3 за зелен, 4 за син]:” и чака вход
            Принтира в конзолата следният текст: “Създаден е червен кръг с радиус 3,00, и диаметър 6,00”
            Принтира в конзолата следният текст:
            Изберете опция:
                -Периметър
                -Лице
                -Луна ли е?
                -Направи кръга луна
            Принтирай toString
            И показва следните резултати за различните опции:
                -За опция 1 -> Периметърът на кръга е <СТОЙНОСТ>
                -За опция 2 -> Лицето на кръга е <СТОЙНОСТ>
                -За опция 3 -> Ако кръгът не е жълт: Кръгът не е луна , Ако кръгът е жълт: Кръгът е луна.
                -За опция 4. -> Ако кръгът не е жълт: прави му цвета жълт и показва “Готов. Направих кръга на луна”; Ако кръгът е жълт показва “Кръгът вече е луна. Няма да правя нищо.”
                -За опция 5. -> Кръг с радиус <СТОЙНОСТ> и диаметър <СТОЙНОСТ>.
            Периметър: <СТОЙНОСТ>
            Лице: <СТОЙНОСТ>
            Цвят: <СТОЙНОСТ>“
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете дължината на радиус или 0 за радиус по подразбиране [1.0]: ");
        double radius = scanner.nextDouble();
        scanner.nextLine();
        if (radius <= 0) {
            radius = 1.0;
        }
        
        System.out.print("Изберете цвят [1 за жълт, 2 за червен, 3 за зелезен, 4 за син]: ");
        int colorChoice = scanner.nextInt();
        Color color = getColorChoice(colorChoice);

        Circle circle = new Circle(radius, color);
        System.out.println("Създаден е " + getColorName(color) + " кръг с радиус " +
                String.format("%.2f", circle.getRadius()) +
                ", и диаметър " + String.format("%.2f", 2 * circle.getRadius()));

        System.out.println("Изберете опция:");
        System.out.println("1. Периметър:");
        System.out.println("2. Лице");
        System.out.println("3. Луна ли е?");
        System.out.println("4. Направи кръга луна");
        System.out.println("5. принтирай toString");

        handleUserChoice(scanner, circle);
    }

    private static void handleUserChoice(Scanner scanner, Circle circle) {
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("Периметърът на кръга е " + String.format("%.2f", circle.getCircumference()));
                break;
            case 2:
                System.out.println("Лицето на кръга е " + String.format("%.2f", circle.getArea()));
                break;
            case 3:
                if (circle.getColor() != Color.YELLOW) {
                    System.out.println("Кръгът не е луна");
                } else {
                    System.out.println("Кръгът е луна.");
                }
                break;
            case 4:
                if (circle.getColor() != Color.YELLOW) {
                    circle.makeMeMoon();
                    System.out.println("Готово. Направих кръга на луна.");
                } else {
                    System.out.println("Кргът вече е луна. Няма да правя нищо.");
                }
                break;
            case 5:
                System.out.println(circle.toString());
                break;
            default:
                System.out.println("Невалидна опция");
        }
    }

    private static Color getColorChoice(int choice) {
        switch (choice) {
            case 1:
                return Color.YELLOW;
            case 2:
                return Color.RED;
            case 3:
                return Color.GREEN;
            case 4:
                return Color.BLUE;
            default:
                return Color.YELLOW;
        }
    }

    public static String getColorName(Color color) {
        switch (color) {
            case YELLOW:
                return "жълт";
            case RED:
                return "червен";
            case GREEN:
                return "зелен";
            case BLUE:
                return "син";
            default:
                return "";
        }
    }
}
