import java.util.Scanner;

/**
 * COMP 110 - Chapter 5: Loops
 * Slides 18
 * Assumptions: Input supplies int tokens ending in sentinel 0; total fits long.
 */
public class SentinelValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers; 0 ends input:");
        long sum = 0;
        int value = input.nextInt();
        while (value != 0) {
            sum += value;
            value = input.nextInt();
        }
        System.out.println("Sum: " + sum);
    }
}
