import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/** Slides 12-14. Binary +, -, *, /; left associativity; integer operands.
 * Infix accepts nonnegative integers, whitespace, and parentheses.
 * Unary operators and exponentiation are deliberately outside this grammar.
 * Evaluation uses checked long arithmetic and Java integer division.
 */
public final class ExpressionDemo {
    private static boolean operator(String token) {
        return token.length() == 1 && "+-*/".contains(token);
    }
    private static int precedence(String token) {
        return (token.equals("*") || token.equals("/")) ? 2 : 1;
    }
    public static String toPostfix(String infix) {
        List<String> output = new ArrayList<>();
        Deque<String> operators = new ArrayDeque<>();
        boolean needOperand = true;
        for (int i = 0; i < infix.length();) {
            char ch = infix.charAt(i);
            if (Character.isWhitespace(ch)) { i++; continue; }
            if (ch >= '0' && ch <= '9') {
                if (!needOperand) throw new IllegalArgumentException("missing operator");
                int start = i++;
                while (i < infix.length() && infix.charAt(i) >= '0' && infix.charAt(i) <= '9') i++;
                String number = infix.substring(start, i);
                Long.parseLong(number);
                output.add(number);
                needOperand = false;
                continue;
            }
            String token = String.valueOf(ch);
            i++;
            if (ch == '(') {
                if (!needOperand) throw new IllegalArgumentException("missing operator before (");
                operators.push(token);
            } else if (ch == ')') {
                if (needOperand) throw new IllegalArgumentException("missing operand before )");
                while (!operators.isEmpty() && !operators.peek().equals("(")) output.add(operators.pop());
                if (operators.isEmpty()) throw new IllegalArgumentException("unmatched )");
                operators.pop();
                needOperand = false;
            } else if (operator(token)) {
                if (needOperand) throw new IllegalArgumentException("expected operand");
                while (!operators.isEmpty() && !operators.peek().equals("(")
                        && precedence(operators.peek()) >= precedence(token)) output.add(operators.pop());
                operators.push(token);
                needOperand = true;
            } else throw new IllegalArgumentException("unsupported character: " + ch);
        }
        if (needOperand) throw new IllegalArgumentException("empty or incomplete expression");
        while (!operators.isEmpty()) {
            String token = operators.pop();
            if (token.equals("(")) throw new IllegalArgumentException("unmatched (");
            output.add(token);
        }
        return String.join(" ", output);
    }
    public static long evaluatePostfix(String postfix) {
        Deque<Long> values = new ArrayDeque<>();
        if (postfix.trim().isEmpty()) throw new IllegalArgumentException("empty expression");
        for (String token : postfix.trim().split("\\s+")) {
            if (!operator(token)) { values.push(Long.parseLong(token)); continue; }
            if (values.size() < 2) throw new IllegalArgumentException("operator needs two operands");
            long right = values.pop(), left = values.pop();
            long result;
            switch (token) {
                case "+": result = Math.addExact(left, right); break;
                case "-": result = Math.subtractExact(left, right); break;
                case "*": result = Math.multiplyExact(left, right); break;
                case "/":
                    if (left == Long.MIN_VALUE && right == -1) throw new ArithmeticException("overflow");
                    result = left / right; break;
                default: throw new IllegalArgumentException(token);
            }
            values.push(result);
        }
        if (values.size() != 1) throw new IllegalArgumentException("extra operands");
        return values.pop();
    }
    public static void main(String[] args) {
        for (String infix : new String[] {"2 * (3 + 4)", "8 - 2 - 1", "12 / (2 + 1)"}) {
            String postfix = toPostfix(infix);
            System.out.println(infix + " -> " + postfix + " -> " + evaluatePostfix(postfix));
        }
    }
}
