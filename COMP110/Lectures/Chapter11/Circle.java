/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 7, 8, 17
 * Assumptions: Finite nonnegative radius; use ordinary magnitudes for finite computed areas.
 */
public class Circle extends GeometricObject {
    private double radius;
    public Circle() { this(1); }
    public Circle(double radius) { this(radius, "white", false); }
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        setRadius(radius);
    }

    public double getRadius() { return radius; }
    public void setRadius(double radius) {
        if (!Double.isFinite(radius) || radius < 0) {
            throw new IllegalArgumentException("Invalid radius");
        }
        this.radius = radius;
    }
    public double getArea() { return Math.PI * radius * radius; }
    public double getDiameter() { return 2 * radius; }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override public String toString() {
        return super.toString() + ",radius=" + radius;
    }
}
