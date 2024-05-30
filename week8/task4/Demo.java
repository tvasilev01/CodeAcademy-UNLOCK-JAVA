package week8.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        /*
            Дефинирайте следните класове – Car и Demo с main метод.
            Car -> Колата има марка, модел, тип каросерия, цвят, дължина, ширина, тегло, тип двигател (бензин, дизел, хибрид, електрически), цена и екстри (опционални).
            Възможните екстри са -> Климатик, Автоматик, Навигация, Темпомат или Ел. стъкла.
            Demo -> Прочетете число N, обозначаващо броят на колите, които трябва да произведете за деня.
            Всяка втора кола, трябва да бъде оборудвана с поне 2 екстри, като ако има:
                -климатик цената на колата трябва да се увеличи с 1500лв
                -Навигация – 500лв.
                - Темпомат – 350лв.
                - Автоматик – 3000лв.
                -ел. стъкла – 250лв.
            След като завърши производството на колите, трябва да изкарате на конзолата следната статистика:
                -Брой произведени коли за деня
                -Обща стойност на произведените коли
                -Колко коли са произведени с екстри?
                -Колко коли са произведени с различните типове двигатели?
            Принтирайте всички произведени коли с тяхната информация по реда на въвеждането им, като ако колата няма екстри,
            трябва да изписвате “This car is not equipped with any extras”.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of cars to produce for the day: ");
        int numberOfCars = scanner.nextInt();
        scanner.nextLine();

        List<Car> carList = new ArrayList<>();
        double totalValue = 0;

        for (int i = 0; i < numberOfCars; i++) {
            System.out.print("\nEnter information for car N" + (i + 1) + ":");
            System.out.print("\nBrand: ");
            String brand = scanner.nextLine();
            System.out.print("Model: ");
            String model = scanner.nextLine();
            System.out.print("Body Type: ");
            String bodyType = scanner.nextLine();
            System.out.print("Color: ");
            String color = scanner.nextLine();
            System.out.print("Length: ");
            double length = scanner.nextDouble();
            System.out.print("Width: ");
            double width = scanner.nextDouble();
            System.out.print("Weight: ");
            double weight = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Engine Type (Gasoline/Diesel/Hybrid/Electric): ");
            String engineType = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            String[] extras = new String[0];

            if (i % 2 != 0) {
                System.out.println("This car will have extras. Choose extras form the following list: ");
                System.out.println("- Air Conditioning");
                System.out.println("- Navigation");
                System.out.println("- Cruise Control");
                System.out.println("- Automatic Transmission");
                System.out.println("- Power Windows");

                String extrasInput = scanner.nextLine();
                extras = extrasInput.split(",\\s+");
                System.out.println();
            }

            double extrasPrice = updatePriceWithExtras(extras);
            double totalPrice = price + extrasPrice;
            totalValue += totalPrice;

            carList.add(new Car(brand, model, bodyType, color, length, width, weight, engineType, totalPrice, extras));
        }

        int totalCars = carList.size();
        int carsWithExtras = numberOfCars / 2;
        int carsWithGasoline = 0;
        int carsWithDiesel = 0;
        int carsWithHybrid = 0;
        int carsWithElectric = 0;

        for (Car car : carList) {
            if (car.extras.length > 0) {
                car.printCarInfo(car.extras);
            } else {
                car.printCarInfo();
            }

            if (car.engineType.equalsIgnoreCase("Gasoline")) {
                carsWithGasoline++;
            }
            if (car.engineType.equalsIgnoreCase("Diesel")) {
                carsWithDiesel++;
            }
            if (car.engineType.equalsIgnoreCase("Hybrid")) {
                carsWithHybrid++;
            }
            if (car.engineType.equalsIgnoreCase("Electric")) {
                carsWithElectric++;
            }
        }

        System.out.println("Statistics: ");
        System.out.println("Total cars produced: " + totalCars);
        System.out.println("Total value of produced cars: " + totalValue + " BGN");
        System.out.println("Cars with extras: " + carsWithExtras);
        System.out.println("Cars with Gasoline engine: " + carsWithGasoline);
        System.out.println("Cars with Diesel engine: " + carsWithDiesel);
        System.out.println("Cars with Hybrid engine: " + carsWithHybrid);
        System.out.println("Cars with Electric engine: " + carsWithElectric);
    }

    private static double updatePriceWithExtras(String[] extras) {
        double extrasPrice = 0;
        for (String extra : extras) {
            switch (extra.trim().toLowerCase()) {
                case "air conditioning":
                    extrasPrice += 1500;
                    break;
                case "navigation":
                    extrasPrice += 500;
                    break;
                case "cruise control":
                    extrasPrice += 350;
                    break;
                case "automatic transmission":
                    extrasPrice += 3000;
                    break;
                case "power windows":
                    extrasPrice += 250;
                    break;
            }
        }
        return extrasPrice;
    }
}