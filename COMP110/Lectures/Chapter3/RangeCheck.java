import java.util.Scanner;
import java.util.Locale;

/**
 * COMP 110 - Chapter 3: Selections
 * Slides 42
 * Minimum Java version for this source: 8
 * Assumptions: Any double token can be checked, including NaN and Infinity.
 */
public class RangeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.print("Enter score: ");
        double score = input.nextDouble();
        boolean valid = Double.isFinite(score)
            && score >= 0 && score <= 100;
        System.out.println("Valid: " + valid);
        // 0 <= score <= 100 is invalid Java.
    }
}
