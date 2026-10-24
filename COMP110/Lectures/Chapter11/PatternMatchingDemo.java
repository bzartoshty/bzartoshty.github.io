/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 36
 */
public class PatternMatchingDemo {
    public static void main(String[] args) {
        Object value = new Circle(2);
        if (value instanceof Circle circle) {
            System.out.println(circle.getRadius());
        } else if (value instanceof Rectangle rectangle) {
            System.out.println(rectangle.getArea());
        }
    }
}
