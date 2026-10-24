import java.util.Scanner;
import java.util.Locale;

/**
 * COMP 110 - Chapter 2: Elementary Programming
 * Slides 32
 * Assumptions: Finite temperature in Fahrenheit.
 */
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.print("Enter Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.printf(Locale.US, "Celsius: %.2f%n", celsius);
    }
}
