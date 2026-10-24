/**
 * COMP 110 - Chapter 9: Objects and Classes
 * Slides 11
 * Assumptions: Compile with Circle.java.
 */
public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0);
        System.out.println(circle.getRadius());
        System.out.printf(java.util.Locale.US,
            "Area: %.2f%n", circle.getArea());
        circle.setRadius(3.0);
        System.out.println(circle.getRadius());
        // circle.radius = -1; // Private field: does not compile.
    }
}
