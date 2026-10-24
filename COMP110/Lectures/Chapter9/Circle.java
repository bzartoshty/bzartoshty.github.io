/**
 * COMP 110 - Chapter 9: Objects and Classes
 * Slides 6, 7, 8, 9, 10, 31
 * Assumptions: Radius is finite and nonnegative. Area/perimeter must be representable for meaningful finite results. Count tracks successful constructions, not live objects.
 */
public class Circle {
    private double radius;
    private static int createdCount;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        validateRadius(radius);
        this.radius = radius;
        createdCount++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        validateRadius(radius);
        this.radius = radius;
    }

    private static void validateRadius(double radius) {
        if (!Double.isFinite(radius) || radius < 0) {
            throw new IllegalArgumentException("Invalid radius");
        }
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public static int getCreatedCount() {
        return createdCount;
    }
}
