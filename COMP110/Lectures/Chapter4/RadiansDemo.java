import java.util.Locale;

/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 5
 */
public class RadiansDemo {
    public static void main(String[] args) {
        double radians = Math.toRadians(30);
        System.out.printf(Locale.US, "sin: %.3f%n", Math.sin(radians));
        System.out.printf(Locale.US, "cos: %.3f%n", Math.cos(0));
        System.out.printf(Locale.US, "degrees: %.1f%n",
            Math.toDegrees(Math.PI));
    }
}
