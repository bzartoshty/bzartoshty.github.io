import java.util.Locale;

/**
 * COMP 110 - Chapter 5: Loops
 * Slides 23
 */
public class IntegerControlledSeries {
    public static void main(String[] args) {
        double sum = 0;
        for (int tenths = 10; tenths >= 1; tenths--) {
            sum += tenths / 10.0;
        }
        System.out.printf(Locale.US, "Sum: %.1f%n", sum);
    }
}
