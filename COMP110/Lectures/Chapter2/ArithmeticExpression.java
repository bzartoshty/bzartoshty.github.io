/**
 * COMP 110 - Chapter 2: Elementary Programming
 * Slides 30
 */
public class ArithmeticExpression {
    public static void main(String[] args) {
        double x = 2, y = 4;
        double a = 1, b = 2, c = 3;
        double result = (3 + 4 * x) / 5
            - 10 * (y - 5) * (a + b + c) / x
            + 9 * (4 / x + (9 + x) / y);
        System.out.println(result);
    }
}
