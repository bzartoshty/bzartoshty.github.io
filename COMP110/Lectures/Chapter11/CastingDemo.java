import java.util.*;

/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 35
 */
public class CastingDemo {
    public static void display(GeometricObject value) {
        if (value instanceof Circle) {
            Circle circle = (Circle) value;
            System.out.printf(Locale.US,
        "Circle: %.2f, diameter %.1f%n",
                circle.getArea(), circle.getDiameter());
        } else if (value instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) value;
            System.out.println("Rectangle: " + rectangle.getArea());
        }
    }

    public static void main(String[] args) {
        display(new Circle(2));
        display(new Rectangle(3, 4));
    }
}
