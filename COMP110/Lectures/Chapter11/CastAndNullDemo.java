/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 37
 */
public class CastAndNullDemo {
    public static void main(String[] args) {
        Object value = new Rectangle(2, 3);
        try {
            Circle circle = (Circle) value;
            System.out.println(circle.getRadius());
        } catch (ClassCastException ex) {
            System.out.println("ClassCastException");
        }
        Circle missing = (Circle) null;
        System.out.println(missing == null);
        System.out.println(missing instanceof Circle);
    }
}
