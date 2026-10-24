/**
 * COMP 110 - Chapter 9: Objects and Classes
 * Slides 21
 */
public class ReassignObjectDemo {
    static void replace(Circle circle) {
        circle = new Circle(9);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(2);
        replace(circle);
        System.out.println(circle.getRadius());
    }
}
