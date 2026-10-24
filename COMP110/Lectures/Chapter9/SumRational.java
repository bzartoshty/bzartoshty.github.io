import java.util.Scanner;

/**
 * COMP 110 - Chapter 9: Objects and Classes
 * Slides 60
 * Assumptions: Input is a positive int below Integer.MAX_VALUE. Every reduced intermediate sum must fit Rational int fields.
 */
public class SumRational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n < 1) {
            throw new IllegalArgumentException("n must be positive");
        }
        Rational sum = new Rational();
        StringBuilder expression = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i > 1) expression.append(" + ");
            Rational term = new Rational(1, i);
            expression.append(term);
            sum = sum.add(term);
        }
        System.out.println(expression + " = " + sum);
    }
}
