import java.util.Scanner;
import java.util.Locale;

/**
 * COMP 110 - Chapter 3: Selections
 * Slides 11
 * Minimum Java version for this source: 8
 * Assumptions: Finite numeric radius of ordinary magnitude; negative values are rejected.
 */
public class CircleAreaSelection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        if (radius >= 0) {
            double area = radius * radius * 3.14159;
            System.out.println("Area = " + area);
        } else {
            System.out.println("Negative radius");
        }
    }
}
