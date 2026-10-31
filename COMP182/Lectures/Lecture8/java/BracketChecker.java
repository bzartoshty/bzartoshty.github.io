import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

/** Slide 5: a brace-only version and an extension to (), [], {}.
 * Non-bracket characters are ignored. This is not a Java source parser:
 * brackets inside strings and comments are still counted.
 */
public final class BracketChecker {
    public static boolean bracesBalanced(String text) {
        Objects.requireNonNull(text);
        Deque<Character> stack = new ArrayDeque<>();
        for (char ch : text.toCharArray()) {
            if (ch == '{') stack.push(ch);
            else if (ch == '}') {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
    public static boolean balanced(String text) {
        Objects.requireNonNull(text);
        Deque<Character> stack = new ArrayDeque<>();
        String opens = "([{", closes = ")]}";
        for (char ch : text.toCharArray()) {
            if (opens.indexOf(ch) >= 0) stack.push(ch);
            else {
                int index = closes.indexOf(ch);
                if (index >= 0 && (stack.isEmpty() || stack.pop() != opens.charAt(index)))
                    return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        for (String text : new String[] {"abc{defg{ijk}{l{mn}}op}qr", "abc{def}}{ghij{kl}m", "([{}])", "([)]"})
            System.out.println(text + " -> " + balanced(text));
    }
}
