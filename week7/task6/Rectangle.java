package week7.task6;

public class Rectangle implements GeometricObject {
    private double width;
    private double length;

    Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle: width=" + width + ", length=" + length;
    }
}
