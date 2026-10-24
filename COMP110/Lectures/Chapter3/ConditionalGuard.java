import java.util.Scanner;

/**
 * COMP 110 - Chapter 3: Selections
 * Slides 64
 * Minimum Java version for this source: 8
 */
public class ConditionalGuard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number and divisor: ");
        int number = input.nextInt();
        int divisor = input.nextInt();
        String result = divisor == 0
            ? "No quotient"
            : "Quotient: " + (number / divisor);
        System.out.println(result);
    }
}
