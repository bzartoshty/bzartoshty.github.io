/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 43
 */
public class EqualsOverloadDemo {
    static class BadValue {
        private final int radius;
        BadValue(int radius) { this.radius = radius; }
        public boolean equals(BadValue other) {
            return other != null && radius == other.radius;
        }
    }

    public static void main(String[] args) {
        BadValue first = new BadValue(2);
        BadValue second = new BadValue(2);
        Object asObject = second;
        System.out.println(first.equals(second));
        System.out.println(first.equals(asObject));
    }
}
