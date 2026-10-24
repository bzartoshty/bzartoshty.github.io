import java.util.Locale;

/**
 * COMP 110 - Chapter 5: Loops
 * Slides 58
 */
public class SumSeries {
    public static void main(String[] args) {
        double sum = 0;
        for (int numerator = 1; numerator <= 97; numerator += 2) {
            sum += (double) numerator / (numerator + 2);
        }
        System.out.printf(Locale.US, "Sum: %.6f%n", sum);
    }
}
