/**
 * COMP 110 - Chapter 9: Objects and Classes
 * Slides 15
 * Assumptions: Caller supplies an appropriate radius. This small example illustrates constructor availability, not validation.
 */
public class RequiredRadius {
    private double radius;

    public RequiredRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
