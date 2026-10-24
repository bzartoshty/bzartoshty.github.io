import java.util.Scanner;

/**
 * COMP 110 - Chapter 5: Loops
 * Slides 40
 * Assumptions: Nonnegative int; uppercase unsigned-looking representation of that nonnegative value.
 */
public class Dec2Hex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a nonnegative int: ");
        int number = input.nextInt();
        if (number < 0) {
            System.out.println("Negative input");
            return;
        }
        int remaining = number;
        String hex = "";
        do {
            int digit = remaining % 16;
            char symbol = digit < 10
                ? (char) ('0' + digit) : (char) ('A' + digit - 10);
            hex = symbol + hex;
            remaining /= 16;
        } while (remaining > 0);
        System.out.println("Hex: " + hex);
    }
}
