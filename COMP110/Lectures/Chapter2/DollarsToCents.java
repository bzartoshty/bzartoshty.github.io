import java.util.Scanner;
import java.util.Locale;

/**
 * COMP 110 - Chapter 2: Elementary Programming
 * Slides 53
 * Assumptions: Nonnegative finite small dollar amounts; round to nearest whole cent as a teaching approximation. Not an exact decimal-money parser.
 */
public class DollarsToCents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.print("Enter dollars: ");
        double dollars = input.nextDouble();
        long cents = Math.round(dollars * 100);
        System.out.println("Nearest whole cents: " + cents);
    }
}
