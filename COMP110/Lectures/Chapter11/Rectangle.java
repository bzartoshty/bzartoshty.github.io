/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 9
 * Assumptions: Finite nonnegative dimensions; ordinary magnitudes for finite computed area.
 */
public class Rectangle extends GeometricObject {
    private final double width;
    private final double height;
    public Rectangle(double width, double height) {
        super();
        if (!Double.isFinite(width) || !Double.isFinite(height)
                || width < 0 || height < 0) {
            throw new IllegalArgumentException(
        "Invalid dimensions");
        }
        this.width = width;
        this.height = height;
    }
    public double getWidth() { return width; }
    public double getHeight() { return height; }
    public double getArea() { return width * height; }
    @Override public String toString() {
        return super.toString() + ",width=" + width + ",height=" + height;
    }
}
