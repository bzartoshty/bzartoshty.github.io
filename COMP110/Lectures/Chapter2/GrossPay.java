import java.util.Scanner;
import java.util.Locale;

/**
 * COMP 110 - Chapter 2: Elementary Programming
 * Slides 23
 * Assumptions: Nonnegative finite values; straight-time pay only, without deductions or overtime rules.
 */
public class GrossPay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.print("Enter hours and hourly rate: ");
        double hours = input.nextDouble();
        double hourlyRate = input.nextDouble();
        double grossPay = hours * hourlyRate;
        System.out.printf(Locale.US, "Gross pay: $%.2f%n", grossPay);
    }
}
