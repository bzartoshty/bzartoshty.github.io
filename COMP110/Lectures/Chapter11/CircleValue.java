/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 40, 41
 * Assumptions: Immutable finite nonnegative radius; normalize signed zero; exact radius value equality, not an approximate measurement comparison.
 */
public final class CircleValue {
    private final double radius;
    public CircleValue(double radius) {
        if (!Double.isFinite(radius) || radius < 0) {
            throw new IllegalArgumentException("Invalid radius");
        }
        this.radius = radius == 0 ? 0 : radius;
    }
    public double getRadius() { return radius; }

    @Override public boolean equals(Object value) {
        if (this == value) return true;
        if (!(value instanceof CircleValue)) return false;
        CircleValue other = (CircleValue) value;
        return Double.compare(radius, other.radius) == 0;
    }
    @Override public int hashCode() {
        return Double.hashCode(radius);
    }
}
