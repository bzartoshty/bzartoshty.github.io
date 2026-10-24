import java.util.Scanner;

/**
 * COMP 110 - Chapter 9: Objects and Classes
 * Slides 61
 * Assumptions: Read a positive count followed by that many valid numerator/denominator int pairs. Rational constructors must succeed.
 */
public class MaxRational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        if (count < 1) {
            throw new IllegalArgumentException("Empty input");
        }
        Rational best = new Rational(input.nextInt(), input.nextInt());
        for (int i = 1; i < count; i++) {
            Rational value = new Rational(
                input.nextInt(), input.nextInt());
            if (value.compareTo(best) > 0) best = value;
        }
        System.out.println(best);
    }
}
