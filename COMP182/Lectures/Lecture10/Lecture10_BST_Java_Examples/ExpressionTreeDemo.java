import java.util.*;
public class ExpressionTreeDemo {
    record Expr(String token, Expr left, Expr right) {
        static Expr leaf(String token) { return new Expr(token, null, null); }
        double evaluate(Map<String,Double> values) {
            if (left == null && right == null) {
                if (values.containsKey(token)) return values.get(token);
                return Double.parseDouble(token);
            }
            double a = left.evaluate(values), b = right.evaluate(values);
            return switch (token) {
                case "+" -> a + b; case "-" -> a - b; case "*" -> a * b;
                default -> throw new IllegalArgumentException(token);
            };
        }
    }
    public static double evaluate(double a, double b) {
        Expr tree = new Expr("+",
            new Expr("*", Expr.leaf("2"), new Expr("-", Expr.leaf("a"), Expr.leaf("1"))),
            new Expr("*", Expr.leaf("3"), Expr.leaf("b")));
        return tree.evaluate(Map.of("a", a, "b", b));
    }
    public static void main(String[] args) {
        System.out.println("a=4, b=5: " + evaluate(4,5));
    }
}
