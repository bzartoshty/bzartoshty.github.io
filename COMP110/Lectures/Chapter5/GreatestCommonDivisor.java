import java.util.Scanner;

/**
 * COMP 110 - Chapter 5: Loops
 * Slides 37
 * Assumptions: Inputs 1-1000000; brute-force candidate loop with safe counter range.
 */
public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two positive ints: ");
        int first = input.nextInt();
        int second = input.nextInt();
        if (first < 1 || second < 1 || first > 1000000
                || second > 1000000) {
            System.out.println("Use values from 1 to 1000000");
            return;
        }
        int gcd = 1;
        for (int candidate = 2; candidate <= first
                && candidate <= second; candidate++) {
            if (first % candidate == 0 && second % candidate == 0) {
                gcd = candidate;
            }
        }
        System.out.println("GCD: " + gcd);
    }
}
