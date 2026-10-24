import java.util.Scanner;

/**
 * COMP 110 - Chapter 6: Methods
 * Slides 40-43: Complete score report using stepwise refinement.
 * Run: java ScoreReport
 * Enter two numeric scores from 0 through 100.
 */
public class ScoreReport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double first = readScore(input);
        double second = readScore(input);
        double mean = average(first, second);
        char grade = letterGrade(mean);
        printReport(mean, grade);
    }

    static double readScore(Scanner input) {
        System.out.print("Score (0 to 100): ");
        return input.nextDouble();
    }

    static double average(double a, double b) {
        return (a + b) / 2.0;
    }

    static char letterGrade(double score) {
        if (score >= 90) return 'A';
        if (score >= 80) return 'B';
        if (score >= 70) return 'C';
        if (score >= 60) return 'D';
        return 'F';
    }

    static void printReport(double mean, char grade) {
        System.out.printf("Average: %.1f%n", mean);
        System.out.println("Grade: " + grade);
    }
}
