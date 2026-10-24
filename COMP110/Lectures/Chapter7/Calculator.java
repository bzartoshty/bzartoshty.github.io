/**
 * COMP 110 - Chapter 7: Arrays
 * Slides 58, 59
 * Assumptions: Arithmetic results must fit in int. Division uses integer arithmetic.
 */
public class Calculator {
    static int calculate(int a, String op, int b) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
            default:
                throw new IllegalArgumentException(
                    "Unknown operator");
        }
    }

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Calculator 2 + 3");
            return;
        }
        try {
            int left = Integer.parseInt(args[0]);
            int right = Integer.parseInt(args[2]);
            System.out.println(calculate(left, args[1], right));
        } catch (IllegalArgumentException | ArithmeticException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
