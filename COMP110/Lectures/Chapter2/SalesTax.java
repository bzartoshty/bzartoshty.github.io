import java.util.Scanner;
import java.util.Locale;

/**
 * COMP 110 - Chapter 2: Elementary Programming
 * Slides 45
 * Assumptions: Nonnegative finite sample purchase; hypothetical 6% tax for arithmetic practice.
 */
public class SalesTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        final double TAX_RATE = 0.06;
        System.out.print("Enter purchase amount: ");
        double purchase = input.nextDouble();
        double tax = purchase * TAX_RATE;
        System.out.printf(Locale.US, "Tax: $%.2f%n", tax);
        System.out.printf(Locale.US, "Total: $%.2f%n", purchase + tax);
    }
}
