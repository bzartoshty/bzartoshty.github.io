import java.util.Scanner;
import java.util.Locale;

/**
 * COMP 110 - Chapter 3: Selections
 * Slides 35, 36
 * Minimum Java version for this source: 8
 * Assumptions: Hypothetical marginal bands at 40 and 54 hours; finite nonnegative sample inputs.
 */
public class TieredGrossPay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.print("Enter hours and rate: ");
        double hours = input.nextDouble();
        double rate = input.nextDouble();
        if (!Double.isFinite(hours) || !Double.isFinite(rate)
                || hours < 0 || rate < 0) {
            System.out.println("Invalid input");
            return;
        }
        double pay;
        if (hours <= 40) {
            pay = hours * rate;
        } else if (hours <= 54) {
            pay = 40 * rate + (hours - 40) * rate * 1.5;
        } else {
            pay = 40 * rate + 14 * rate * 1.5
                + (hours - 54) * rate * 2;
        }
        System.out.printf(Locale.US, "Pay: $%.2f%n", pay);
    }
}
