package week7.task3;

public class Square extends Shape{
    private double side;

    Square(double side){
        this.side = side;
    }

    @Override
    double getArea() {
        return side * side;
    }

    @Override
    double getPerimeter() {
        return 4 * side;
    }
}
