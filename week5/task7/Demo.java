package week5.task7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        /*
        Дефинирайте следните класове – Car и Demo с main метод.
        Car -> Колата има марка, модел, тип каросерия, цвят, дължина, ширина, тегло, тип двигател (бензин, дизел, хибрид, електрически), цена и екстри (опционални).
        Възможните екстри са -> Климатик, Автоматик, Навигация, Темпомат или Ел. стъкла.
        Demo -> Прочетете число N, обозначаващо броя на колите, които трябва да произведете за деня. Всяка втора кола трябва да бъде оборудвана с поне 2 екстри, като ако има климатик, цената на колата трябва да се увеличи с 1500лв, Навигация – 500лв., Темпомат – 350лв., Автоматик – 3000лв. и ел. стъкла – 250лв.
        След като завърши производството на колите, трябва да изкарате на конзолата следната статистика:
        Брой произведени коли за деня
        Обща стойност на произведените коли
        Колко коли са произведени с екстри?
        Колко коли са произведени с различните типове двигатели?
        Принтирайте всички произведени коли с тяхната информация по реда на въвеждането им, като ако колата няма екстри, трябва да изписвате “This car is not equipped with any extras”.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете броя автомобили които трябва да бъдат произведени за деня: ");
        int numCars = scanner.nextInt();
        scanner.nextLine();

        List<Car> cars = new ArrayList<>();

        for (int i = 1; i <= numCars; i++) {
            System.out.println("\nВъведете детайли за кола номер " + i + ":");
            System.out.print("Марка: ");
            String brand = scanner.nextLine();
            System.out.print("Модел: ");
            String model = scanner.nextLine();
            System.out.print("Тип каросерия(Седан, Хетчбек, Лифтбек, Комби, MPV, SUV, Джип, Кабриолет, Пикап): ");
            String bodyType = scanner.nextLine();
            System.out.print("Цвят: ");
            String color = scanner.nextLine();
            System.out.print("Дължина: ");
            double length = scanner.nextDouble();
            System.out.print("Ширина: ");
            double width = scanner.nextDouble();
            System.out.print("Тегло: ");
            double weight = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Тип двигател(бензин, дизел, хибрид, електрически): ");
            String engineType = scanner.nextLine();
            System.out.print("Цена: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            List<String> extras = new ArrayList<>();
            if (i % 2 == 0) {
                System.out.println("Тази кола ще има поне 2 екстри.");
                System.out.println("Налични екстри: (1.Климатик, 2.Навигация, 3.Темпомат, 4.Автоматична скоростна кутия, 5.Ел.стъкла)");
                System.out.print("Въведете броя екстри: ");
                int numExtras = scanner.nextInt();
                scanner.nextLine();

                for (int j = 0; j < numExtras; j++) {
                    System.out.print("Въведете екстра " + (j + 1) + ": ");
                    String extra = scanner.nextLine();
                    extras.add(extra);
                    price = adjustPriceWithExtras(extra, price);
                }
            }

            Car car = new Car(brand, model, bodyType, color, length, width, weight, engineType, price, extras);
            cars.add(car);
        }

        System.out.println("\nСтатистика");
        System.out.println("Брой произведени автомобили: " + cars.size());
        double totalValue = cars.stream().mapToDouble(Car::getPrice).sum();
        System.out.println("Обща стойност на произведените автомобили: " + totalValue);
        long carsWithExtras = cars.stream().filter(car -> !car.getExtras().isEmpty()).count();
        System.out.println("Брой коли с екстри: " + carsWithExtras);
        long carsByEngineType = cars.stream().map(Car::getEngineType).distinct().count();
        System.out.println("Брой автомобили, произведени от различни типове двигатели: " + carsByEngineType);

        System.out.println("\nВсички произведени автомобили: ");
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    private static double adjustPriceWithExtras(String extra, double price) {
        switch (extra.toLowerCase()) {
            case "климатик":
                price += 1500;
                break;
            case "навигация":
                price += 500;
                break;
            case "темпомат":
                price += 350;
                break;
            case "автоматик":
                price += 3000;
                break;
            case "електрически стъкла":
                price += 250;
                break;
            default:
                System.out.println("Този автомобил не е оборудван с никакви екстри.");
        }
        return price;
    }
}
