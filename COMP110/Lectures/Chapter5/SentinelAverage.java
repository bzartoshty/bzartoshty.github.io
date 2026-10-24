import java.util.Scanner;

/**
 * COMP 110 - Chapter 5: Loops
 * Slides 19
 * Assumptions: Scores are 0-100, at most one million scores, followed by -1; count and sum stay in range.
 */
public class SentinelAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter scores 0-100; -1 ends input:");
        long sum = 0;
        int count = 0;
        int score = input.nextInt();
        while (score != -1) {
            sum += score;
            count++;
            score = input.nextInt();
        }
        if (count == 0) System.out.println("No scores");
        else System.out.println("Average: " + (double) sum / count);
    }
}
