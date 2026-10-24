import java.util.Scanner;
import java.util.Locale;

/**
 * COMP 110 - Chapter 2: Elementary Programming
 * Slides 56
 * Assumptions: Valid int followed by a finite decimal token using a period.
 */
public class SingleScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.print("Enter an integer: ");
        int first = input.nextInt();
        System.out.print("Enter a decimal: ");
        double second = input.nextDouble();
        System.out.println("Values: " + first + " " + second);
    }
}
