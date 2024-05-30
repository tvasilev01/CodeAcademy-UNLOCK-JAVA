package week8.task5;

import java.util.Random;

enum Color {
    YELLOW, RED, GREEN, BLUE
}

public class Circle {
    private double radius;
    private Color color;

    public Circle() {
        this.radius = 1.0;
        this.color = getRandomColor();
    }

    public Circle(double radius, Color color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public void makeMeMoon() {
        this.color = Color.YELLOW;
    }

    @Override
    public String toString() {
        return String.format("Кръг с радиус %.2f и диаметър %.2f.\n" +
                                "Периметър: %.2f\n" + "Лице: %.2f\n" +
                                "Цвят: %s", radius, 2 * radius,
                                getCircumference(), getArea(), Main.getColorName(color));
    }

    private Color getRandomColor() {
        Color[] colors = {Color.YELLOW, Color.GREEN, Color.BLUE, Color.RED};
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }
}
