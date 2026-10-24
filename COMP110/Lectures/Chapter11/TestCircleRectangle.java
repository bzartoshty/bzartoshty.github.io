import java.util.*;

/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 10
 */
public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle circle = new Circle(2, "red", true);
        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println(circle.getColor());
        System.out.println(circle.isFilled());
        System.out.printf(Locale.US, "Circle area: %.2f%n",
        circle.getArea());
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println(circle.getDateCreated() != null);
    }
}
