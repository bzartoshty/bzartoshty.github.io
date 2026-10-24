import java.util.Scanner;
import java.util.Locale;

/**
 * COMP 110 - Chapter 3: Selections
 * Slides 33
 * Minimum Java version for this source: 8
 * Assumptions: Hypothetical marginal overtime rule; finite nonnegative inputs of ordinary magnitude.
 */
public class GrossPay {
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
        } else {
            pay = 40 * rate + (hours - 40) * rate * 1.5;
        }
        System.out.printf(Locale.US, "Pay: $%.2f%n", pay);
    }
}
