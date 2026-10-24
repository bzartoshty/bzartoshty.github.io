import java.util.Scanner;

/**
 * COMP 110 - Chapter 3: Selections
 * Slides 8
 * Minimum Java version for this source: 8
 * Assumptions: Integer score from 0 through 100.
 */
public class OneWayIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter score: ");
        int score = input.nextInt();
        if (score >= 90) {
            System.out.println("High score");
        }
        System.out.println("Finished");
    }
}
