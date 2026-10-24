import java.util.Scanner;

/**
 * COMP 110 - Chapter 5: Loops
 * Slides 56
 * Assumptions: Positive int; repeated prime factors printed in increasing order; 1 has no prime factors.
 */
public class PrimeFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive int: ");
        int remaining = input.nextInt();
        if (remaining < 1) {
            System.out.println("Positive input required");
            return;
        }
        if (remaining == 1) {
            System.out.println("No prime factors");
            return;
        }
        for (int divisor = 2;
                divisor <= remaining / divisor; divisor++) {
            while (remaining % divisor == 0) {
                System.out.print(divisor + " ");
                remaining /= divisor;
            }
        }
        if (remaining > 1) System.out.print(remaining);
        System.out.println();
    }
}
