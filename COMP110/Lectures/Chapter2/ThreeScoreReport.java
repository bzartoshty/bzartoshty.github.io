import java.util.Scanner;
import java.util.Locale;

/**
 * COMP 110 - Chapter 2: Elementary Programming
 * Slides 59
 * Assumptions: Each score is an integer from 0 to 100.
 */
public class ThreeScoreReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three scores: ");
        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();
        int total = first + second + third;
        double average = total / 3.0;
        System.out.println("Total: " + total);
        System.out.printf(Locale.US, "Average: %.1f%n", average);
    }
}
