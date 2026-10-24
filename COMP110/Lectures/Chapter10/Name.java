/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 17
 * Assumptions: Name text is non-null and nonblank. Instances are immutable.
 */
public final class Name {
    private final String name;

    public Name() { this("Unknown"); }

    public Name(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Missing name");
        }
        this.name = name.trim();
    }

    public String getName() { return name; }
    @Override
    public String toString() { return name; }
}
