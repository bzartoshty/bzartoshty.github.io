import java.util.Scanner;
import java.util.Locale;

/**
 * COMP 110 - Chapter 3: Selections
 * Slides 71
 * Minimum Java version for this source: 14
 * Assumptions: Finite numeric operands of ordinary magnitude; operator is a token +, -, *, or /.
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        System.out.print("Enter left operator right: ");
        double left = input.nextDouble();
        String operator = input.next();
        double right = input.nextDouble();
        switch (operator) {
            case "+" -> System.out.println(left + right);
            case "-" -> System.out.println(left - right);
            case "*" -> System.out.println(left * right);
            case "/" -> {
                if (right == 0) System.out.println("Zero divisor");
                else System.out.println(left / right);
            }
            default -> System.out.println("Unknown operator");
        }
    }
}
