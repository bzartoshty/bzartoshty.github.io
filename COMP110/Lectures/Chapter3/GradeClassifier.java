import java.util.Scanner;
import java.util.Locale;

/**
 * COMP 110 - Chapter 3: Selections
 * Slides 14, 15
 * Minimum Java version for this source: 8
 * Assumptions: Reads a double score; rejects nonfinite values and values outside 0-100.
 */
public class GradeClassifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.print("Enter score: ");
        double score = input.nextDouble();
        if (!Double.isFinite(score) || score < 0 || score > 100) {
            System.out.println("Invalid score");
            return;
        }
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
