import java.util.Scanner;

/**
 * COMP 110 - Chapter 5: Loops
 * Slides 15
 * Assumptions: Nonnegative int; negative input is rejected.
 */
public class DigitSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a nonnegative int: ");
        int number = input.nextInt();
        if (number < 0) {
            System.out.println("Negative input");
            return;
        }
        int remaining = number;
        int sum = 0;
        while (remaining > 0) {
            sum += remaining % 10;
            remaining /= 10;
        }
        System.out.println("Digit sum: " + sum);
    }
}
