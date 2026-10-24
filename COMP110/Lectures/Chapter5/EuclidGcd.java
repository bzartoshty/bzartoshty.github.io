import java.util.Scanner;

/**
 * COMP 110 - Chapter 5: Loops
 * Slides 38
 * Assumptions: Positive int inputs; Euclidean algorithm extension.
 */
public class EuclidGcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two positive ints: ");
        int first = input.nextInt();
        int second = input.nextInt();
        if (first < 1 || second < 1) {
            System.out.println("Positive inputs required");
            return;
        }
        while (second != 0) {
            int remainder = first % second;
            first = second;
            second = remainder;
        }
        System.out.println("GCD: " + first);
    }
}
