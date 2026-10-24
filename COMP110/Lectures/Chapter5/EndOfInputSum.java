import java.util.Scanner;

/**
 * COMP 110 - Chapter 5: Loops
 * Slides 20
 * Assumptions: Stops at end of input or first token that is not an int; total fits long.
 */
public class EndOfInputSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long sum = 0;
        while (input.hasNextInt()) {
            sum += input.nextInt();
        }
        System.out.println("Sum: " + sum);
    }
}
