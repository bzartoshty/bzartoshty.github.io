import java.util.Scanner;
import java.util.Locale;

/**
 * COMP 110 - Chapter 2: Elementary Programming
 * Slides 21
 * Assumptions: Finite nonnegative radius; magnitude small enough for a finite area.
 */
public class ComputeAreaWithInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        final double PI = 3.14159;
        double area = radius * radius * PI;
        System.out.println("Area = " + area);
    }
}
