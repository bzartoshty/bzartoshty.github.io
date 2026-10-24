/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 18
 * Assumptions: Cylinder has a circular base; finite nonnegative dimensions of ordinary magnitude.
 */
public class Cylinder {
    private final Circle base;
    private final double height;
    public Cylinder(double radius, double height) {
        if (!Double.isFinite(height) || height < 0) {
            throw new IllegalArgumentException("Invalid height");
        }
        this.base = new Circle(radius);
        this.height = height;
    }
    public double getVolume() { return base.getArea() * height; }
}
