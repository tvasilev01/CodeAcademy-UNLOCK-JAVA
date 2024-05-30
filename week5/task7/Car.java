package week5.task7;

import java.util.List;

public class Car {
    private String brand;
    private String model;
    private String bodyType; //Седан, Хетчбек, Лифтбек, Комби, MPV, SUV, Джип, Кабриолет, Пикап
    private String color;
    private double length;
    private double width;
    private double weight;
    private String engineType; //бензин, дизел, хибрид, електрически
    private double price;
    private List<String> extras; //Климатик, Автоматик, Навигация, Темпомат или Ел. стъкла.

    public Car(String brand, String model, String bodyType, String color,
               double length, double width, double weight, String engineType, double price, List<String> extras) {
        this.brand = brand;
        this.model = model;
        this.bodyType = bodyType;
        this.color = color;
        this.length = length;
        this.width = width;
        this.weight = weight;
        this.engineType = engineType;
        this.price = price;
        this.extras = extras;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Марка: ").append(brand).append(", Модел: ").append(model)
                .append(", Тип каросерия: ").append(bodyType).append(", Цвят: ").append(color)
                .append(", Дължина: ").append(length).append(", Ширина: ").append(width)
                .append(", Тегло: ").append(weight).append(", Тип двигател: ").append(engineType)
                .append(", Цена: ").append(price);

        if (!extras.isEmpty()) {
            result.append(", Екстри: ").append(String.join(", ", extras));
        } else {
            result.append(", Този автомобил не е оборудван с никакви екстри");
        }
        return result.toString();
    }

    public String getEngineType() {
        return engineType;
    }

    public List<String> getExtras() {
        return extras;
    }

    public double getPrice() {
        return price;
    }
}
