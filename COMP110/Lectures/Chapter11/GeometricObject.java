import java.time.Instant;
import java.util.Objects;

/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 5, 6
 * Assumptions: Color is non-null; creation Instant is immutable and reflects construction time.
 */
public class GeometricObject {
    private String color;
    private boolean filled;
    private final Instant dateCreated = Instant.now();

    public GeometricObject() { this("white", false); }
    public GeometricObject(String color, boolean filled) {
        this.color = Objects.requireNonNull(color, "color");
        this.filled = filled;
    }

    public String getColor() { return color; }
    public void setColor(String color) {
        this.color = Objects.requireNonNull(color, "color");
    }
    public boolean isFilled() { return filled; }
    public void setFilled(boolean filled) { this.filled = filled; }
    public Instant getDateCreated() { return dateCreated; }
    @Override public String toString() {
        return "color=" + color + ",filled=" + filled;
    }
}
