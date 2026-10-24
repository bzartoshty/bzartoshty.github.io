import java.util.Locale;

/**
 * COMP 110 - Chapter 2: Elementary Programming
 * Slides 44
 * Assumptions: Small positive sample only for the multiply/cast truncation demonstration.
 */
public class DecimalDisplay {
    public static void main(String[] args) {
        double value = 12.345;
        double truncated = (int) (value * 100) / 100.0;
        System.out.println("Stored: " + value);
        System.out.println("Truncated: " + truncated);
        System.out.printf(Locale.US, "Formatted: %.2f%n", value);
        System.out.println("Still stored: " + value);
    }
}
