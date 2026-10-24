import java.util.Scanner;
/**
 * COMP 110 - Chapter 6: Methods
 * Slides 44: Implement the discussion extension with three scores and a highest score.
 * Run: java ThreeScoreReport
 * Assumptions: All three inputs are numeric scores from 0 through 100.
 */
public class ThreeScoreReport {
    static double average(double a, double b, double c) {
        return (a + b + c) / 3.0;
    }

    static double highest(double a, double b, double c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double first = ScoreReport.readScore(input);
        double second = ScoreReport.readScore(input);
        double third = ScoreReport.readScore(input);
        double mean = average(first, second, third);
        char grade = ScoreReport.letterGrade(mean);
        ScoreReport.printReport(mean, grade);
        System.out.printf("Highest: %.1f%n", highest(first, second, third));
    }
}
