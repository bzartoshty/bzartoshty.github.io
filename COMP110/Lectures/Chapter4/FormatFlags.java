import java.util.Locale;

/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 41
 */
public class FormatFlags {
    public static void main(String[] args) {
        System.out.printf(Locale.US, "|%8.2f|%n", 12.3);
        System.out.printf(Locale.US, "|%-8.2f|%n", 12.3);
        System.out.printf(Locale.US, "%+d % d%n", 12, 12);
        System.out.printf(Locale.US, "%05d%n", 42);
        System.out.printf(Locale.US, "%,.2f%n", 12345.6);
        System.out.printf(Locale.US, "|%3d|%n", 12345);
        System.out.printf(Locale.US, "%.3s%n", "Java");
    }
}
