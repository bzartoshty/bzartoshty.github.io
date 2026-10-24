import java.util.Locale;

/**
 * COMP 110 - Chapter 5: Loops
 * Slides 39
 * Assumptions: Hypothetical fixed 7% annual growth model; no rounding after each annual increase.
 */
public class FutureTuition {
    public static void main(String[] args) {
        double tuition = 10000;
        int years = 0;
        while (tuition < 20000) {
            tuition *= 1.07;
            years++;
        }
        System.out.println("Years: " + years);
        System.out.printf(Locale.US, "Tuition: %.2f%n", tuition);
    }
}
