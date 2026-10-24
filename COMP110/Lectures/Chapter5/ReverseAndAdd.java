import java.util.Scanner;

/**
 * COMP 110 - Chapter 5: Loops
 * Slides 16, 17
 * Assumptions: Nonnegative int; long holds the reversed value and its sum with the original.
 */
public class ReverseAndAdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a nonnegative int: ");
        int number = input.nextInt();
        if (number < 0) {
            System.out.println("Negative input");
            return;
        }
        int remaining = number;
        long reverse = 0;
        while (remaining > 0) {
            reverse = reverse * 10 + remaining % 10;
            remaining /= 10;
        }
        long total = number + reverse;
        System.out.println(number + " + " + reverse + " = " + total);
    }
}
