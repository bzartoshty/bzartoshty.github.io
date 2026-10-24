/**
 * COMP 110 - Chapter 9: Objects and Classes
 * Slides 24, 25, 26, 27, 28
 * Assumptions: Dimensions are finite and nonnegative. Calculated results must be representable for finite results.
 */
public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double length, double width) {
        validate(length);
        validate(width);
        this.length = length;
        this.width = width;
    }

    public double getLength() { return length; }
    public double getWidth() { return width; }

    public void setLength(double length) {
        validate(length);
        this.length = length;
    }

    public void setWidth(double width) {
        validate(width);
        this.width = width;
    }

    private static void validate(double value) {
        if (!Double.isFinite(value) || value < 0) {
            throw new IllegalArgumentException("Invalid dimension");
        }
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}
