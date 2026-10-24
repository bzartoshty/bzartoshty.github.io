import java.util.Scanner;
import java.util.Locale;

/**
 * COMP 110 - Chapter 2: Elementary Programming
 * Slides 20
 * Assumptions: Enter a valid int followed by a finite decimal using a period.
 */
public class ReadNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.print("Enter an integer and a decimal: ");
        int count = input.nextInt();
        double rate = input.nextDouble();
        System.out.println("Count = " + count);
        System.out.println("Rate = " + rate);
    }
}
