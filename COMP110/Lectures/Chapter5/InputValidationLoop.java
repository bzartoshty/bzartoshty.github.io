import java.util.Scanner;

/**
 * COMP 110 - Chapter 5: Loops
 * Slides 25
 * Assumptions: Integer tokens are supplied until one is in 1-5; token parsing is not validated.
 */
public class InputValidationLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value;
        do {
            System.out.println("Enter a value from 1 to 5:");
            value = input.nextInt();
        } while (value < 1 || value > 5);
        System.out.println("Accepted: " + value);
    }
}
