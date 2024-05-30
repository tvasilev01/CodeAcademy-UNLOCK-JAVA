package week7.task6;

public class Main {
    public static void main(String[] args) {
        /*
        Напишете interface GeometricObject с абстрактни методи:
        – getArea()
        – getPerimeter()
         Напишете класове Circle:
          – с атрибут radius
          – методи toString, getArea(), getPerimeter()
          Rectangle който го имплементират:
           – с атрибути width, length
           – методи toString, getArea(), getPerimeter()
           Напишете програма която създава два обекта от тип GeometricObject.
           Единия да е Circle, а другия Rectangle.
           Вие си избирете стойности на които да инициализирате атрибутите им.
           Изведете в конзолата areа и perimeter на двата обекта.
           – Сега добавете и интерфейс Resizable който има абстрактен метод resize(int percent).
           – Добавете клас ResizableCircle който наследява Circle и имплементира Resizable.
           Нека имплементацията на метода resize да увеличава радиуса с percent. Демонтстрирайте работата на тази функционалност в main метода.
         */

        GeometricObject circle = new Circle(5.0);
        GeometricObject rectangle = new Rectangle(4.0, 6.0);

        System.out.println(circle.toString() + ", Area: " + circle.getArea() + ", Perimeter: " + circle.getPerimeter());
        System.out.println(rectangle.toString() + ", Area: " + rectangle.getArea() + ", Perimeter: " + rectangle.getPerimeter());

        ResizableCircle resizableCircle = new ResizableCircle(3.0);
        System.out.println("Before Resize: " + resizableCircle.toString() + " - Radius: " + resizableCircle.getArea());
        resizableCircle.resize(50);
        System.out.println("After Resize: " + resizableCircle.toString() + " - Radius: " + resizableCircle.getArea());
    }
}
