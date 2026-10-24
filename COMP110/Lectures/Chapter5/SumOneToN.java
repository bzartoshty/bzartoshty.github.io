import java.util.Scanner;

/**
 * COMP 110 - Chapter 5: Loops
 * Slides 12
 * Assumptions: n in 0-1000000; long accumulator prevents int-sum overflow in this range.
 */
public class SumOneToN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n from 0 to 1000000: ");
        int n = input.nextInt();
        if (n < 0 || n > 1000000) {
            System.out.println("Invalid n");
            return;
        }
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }
}
