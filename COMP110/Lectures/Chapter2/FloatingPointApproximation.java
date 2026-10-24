import java.util.Locale;

/**
 * COMP 110 - Chapter 2: Elementary Programming
 * Slides 33
 */
public class FloatingPointApproximation {
    public static void main(String[] args) {
        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);
        System.out.println(1.0 - 0.9);
        System.out.println(0.5 + 0.25);
        System.out.printf(Locale.US, "Display: %.2f%n", 1.0 - 0.9);
    }
}
