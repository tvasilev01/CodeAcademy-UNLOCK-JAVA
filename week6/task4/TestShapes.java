package week6.task4;

public class TestShapes {
    public static void main(String[] args) {
        /*
            Създайте клас Shape, който дефинира следните методи – getArea(), getPerimeter(), които връщат 0.
            Създайте клас Rectangle, който наследява Shape и има атрибути width, height, конструктор, който приема width & height параметри,
            има getter & setter методи.
            Направете клас Square, който наследява Rectangle. Помислете какъв конструктор ще има този клас.
            Направете програма TestShapes, която илюстрира използването им и правилната работа на getArea() и getPerimeter() методите.
         */
        Rectangle rectangle = new Rectangle(4, 5);
        Square square = new Square(3);

        System.out.println("Правоъгълник: ");
        System.out.println("Дължина: " + rectangle.getWidth());
        System.out.println("Височина: " + rectangle.getHeight());
        System.out.println("Площ: " + rectangle.getArea());
        System.out.println("Периметър: " + rectangle.getPerimeter());

        System.out.println("\nКвадрат: ");
        System.out.println("Страна: " + square.getWidth());
        System.out.println("Площ: " + square.getArea());
        System.out.println("Периметър: " + square.getPerimeter());
    }
}
