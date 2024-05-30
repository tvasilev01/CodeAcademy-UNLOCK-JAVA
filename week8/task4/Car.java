package week8.task4;

public class Car {
    String brand;
    String model;
    String bodyType;
    String color;
    double length;
    double width;
    double weight;
    String engineType;
    double price;
    String[] extras;

    public Car(String brand, String model, String bodyType, String color, double length,
               double width, double weight, String engineType, double price, String[] extras) {

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

    public void printCarInfo(String[] extras) {
        StringBuilder sb = new StringBuilder();
        sb.append("\nBrand: ").append(brand).append("\n");
        sb.append("Model: ").append(model).append("\n");
        sb.append("Body Type: ").append(bodyType).append("\n");
        sb.append("Color: ").append(color).append("\n");
        sb.append("Length: ").append(length).append("\n");
        sb.append("Width: ").append(width).append("\n");
        sb.append("Weight: ").append(weight).append("\n");
        sb.append("Engine Type: ").append(engineType).append("\n");
        sb.append("Price: ").append(price).append(" BGN").append("\n");

        if (extras.length > 0) {
           sb.append("Extras: \n");
            for (String extra : extras) {
               sb.append("- ").append(extra).append("\n");
            }
        } else {
            sb.append("This car is not equipped with any extras.\n");
        }
        System.out.println(sb.toString());
    }

    public void printCarInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Brand: ").append(brand).append("\n");
        sb.append("Model: ").append(model).append("\n");
        sb.append("Body Type: ").append(bodyType).append("\n");
        sb.append("Color: ").append(color).append("\n");
        sb.append("Length: ").append(length).append("\n");
        sb.append("Width: ").append(width).append("\n");
        sb.append("Weight: ").append(weight).append("\n");
        sb.append("Engine Type: ").append(engineType).append("\n");
        sb.append("Price: ").append(price).append(" BGN").append("\n");

        if (extras.length > 0) {
            sb.append("Extras: \n");
            for (String extra : extras) {
                sb.append("- ").append(extra).append("\n");
            }
        } else {
            sb.append("This car is not equipped with any extras.\n");
        }
        System.out.println(sb.toString());
    }
}
