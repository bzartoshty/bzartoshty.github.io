/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 69
 * Assumptions: Non-null name supplied by the driver; explicit plain-Java boilerplate.
 */
public final class PlainProfile {
    private final String name;
    public PlainProfile(String name) { this.name = name; }
    public String getName() { return name; }
    @Override public String toString() { return "Profile:" + name; }
}
