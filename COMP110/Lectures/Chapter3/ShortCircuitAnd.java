import java.util.Scanner;

/**
 * COMP 110 - Chapter 3: Selections
 * Slides 43
 * Minimum Java version for this source: 8
 * Assumptions: Integer arithmetic; guard skips division when divisor is zero.
 */
public class ShortCircuitAnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number and divisor: ");
        int number = input.nextInt();
        int divisor = input.nextInt();
        boolean safe = divisor != 0
            && number / divisor > 2;
        System.out.println("Result: " + safe);
    }
}
