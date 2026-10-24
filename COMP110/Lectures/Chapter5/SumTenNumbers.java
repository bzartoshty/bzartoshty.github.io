import java.util.Scanner;

/**
 * COMP 110 - Chapter 5: Loops
 * Slides 13
 * Assumptions: Exactly ten int tokens are supplied; sum uses long.
 */
public class SumTenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten integers:");
        long sum = 0;
        for (int count = 0; count < 10; count++) {
            int value = input.nextInt();
            sum += value;
        }
        System.out.println("Sum: " + sum);
    }
}
