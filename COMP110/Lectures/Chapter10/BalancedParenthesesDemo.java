/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 74
 * Assumptions: Input is non-null. Only parentheses are structural; all other characters are ignored. This is not a Java-source parser.
 */
public class BalancedParenthesesDemo {
    static boolean balanced(String text) {
        StackOfIntegers stack = new StackOfIntegers();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == '(') stack.push(i);
            else if (ch == ')') {
                if (stack.empty()) return false;
                stack.pop();
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        System.out.println(balanced("(a + (b))"));
        System.out.println(balanced(")("));
        System.out.println(balanced("()"));
    }
}
