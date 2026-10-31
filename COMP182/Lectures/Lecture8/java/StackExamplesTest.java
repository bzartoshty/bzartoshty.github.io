import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.NoSuchElementException;

/** Dependency-free checks. Run: javac *.java, then java StackExamplesTest. */
public final class StackExamplesTest {
    private static int checks;
    private static void check(boolean condition) {
        checks++;
        if (!condition) throw new AssertionError("check " + checks + " failed");
    }
    private static void throwsType(Class<? extends Throwable> expected, Runnable action) {
        checks++;
        try { action.run(); }
        catch (Throwable actual) {
            if (expected.isInstance(actual)) return;
            throw new AssertionError("expected " + expected + ", got " + actual, actual);
        }
        throw new AssertionError("expected " + expected);
    }
    public static void main(String[] args) {
        GenericStack<Integer> a = new GenericStack<>();
        LinkedStack<Integer> b = new LinkedStack<>();
        throwsType(NoSuchElementException.class, a::pop);
        throwsType(NoSuchElementException.class, a::peek);
        throwsType(NoSuchElementException.class, b::pop);
        throwsType(NoSuchElementException.class, b::peek);
        for (int i = 0; i < 1000; i++) { a.push(i); b.push(i); }
        check(a.getSize() == 1000 && b.getSize() == 1000);
        check(a.peek() == 999 && a.getSize() == 1000);
        check(b.peek() == 999 && b.getSize() == 1000);
        for (int i = 999; i >= 0; i--) check(a.pop() == i && b.pop() == i);
        check(a.isEmpty() && b.isEmpty());
        a.push(1); b.push(1); a.clear(); b.clear();
        check(a.getSize() == 0 && b.getSize() == 0);
        check(StackDemo.reverse("CAT").equals("TAC"));
        check(StackDemo.reverse("").equals(""));
        check(BracketChecker.bracesBalanced("abc{defg{ijk}{l{mn}}op}qr"));
        check(!BracketChecker.bracesBalanced("abc{def}}{ghij{kl}m"));
        check(!BracketChecker.bracesBalanced("}{"));
        check(!BracketChecker.bracesBalanced("{{}"));
        check(BracketChecker.balanced("([{}])"));
        check(!BracketChecker.balanced("([)]"));
        check(BracketChecker.balanced(""));
        check(ExpressionDemo.toPostfix("2 * (3 + 4)").equals("2 3 4 + *"));
        check(ExpressionDemo.evaluatePostfix("2 3 4 + *") == 14);
        check(ExpressionDemo.toPostfix("8 - 2 - 1").equals("8 2 - 1 -"));
        check(ExpressionDemo.evaluatePostfix("8 2 - 1 -") == 5);
        check(ExpressionDemo.evaluatePostfix(ExpressionDemo.toPostfix("12 / (2 + 1)")) == 4);
        check(ExpressionDemo.evaluatePostfix("8 2 -") == 6);
        check(ExpressionDemo.evaluatePostfix("8 2 /") == 4);
        for (String bad : new String[] {"", "2 +", "(2+3", "2+3)", "2 3", "()", "-2", "2(3)", "a+1"})
            throwsType(IllegalArgumentException.class, () -> ExpressionDemo.toPostfix(bad));
        for (String bad : new String[] {"", "2 +", "2 3", "hello"})
            throwsType(IllegalArgumentException.class, () -> ExpressionDemo.evaluatePostfix(bad));
        throwsType(ArithmeticException.class, () -> ExpressionDemo.evaluatePostfix("1 0 /"));
        throwsType(ArithmeticException.class, () -> ExpressionDemo.evaluatePostfix("9223372036854775807 1 +"));
        throwsType(ArithmeticException.class, () -> ExpressionDemo.evaluatePostfix("-9223372036854775808 -1 /"));
        Map<String, List<String>> graph = FlightSearchDemo.lectureGraph();
        check(FlightSearchDemo.iterativeRoute(graph, "P", "Z").equals(Arrays.asList("P", "W", "Y", "Z")));
        check(FlightSearchDemo.iterativeRoute(graph, "Q", "Z").isEmpty());
        check(FlightSearchDemo.iterativeRoute(graph, "P", "P").equals(Collections.singletonList("P")));
        check(!FlightSearchDemo.recursiveReachable(graph, "Z", "P"));
        check(FlightSearchDemo.iterativeRoute(graph, "W", "P").isEmpty()); // cycle terminates
        for (String from : graph.keySet()) for (String to : graph.keySet())
            check(FlightSearchDemo.recursiveReachable(graph, from, to)
                    == !FlightSearchDemo.iterativeRoute(graph, from, to).isEmpty());
        throwsType(IllegalArgumentException.class, () -> FlightSearchDemo.iterativeRoute(graph, "?", "Z"));
        check(RecursionDemo.factorial(0) == 1 && RecursionDemo.factorial(3) == 6);
        check(RecursionDemo.factorial(20) == 2432902008176640000L);
        throwsType(IllegalArgumentException.class, () -> RecursionDemo.factorial(-1));
        throwsType(IllegalArgumentException.class, () -> RecursionDemo.factorial(21));
        System.out.println("PASS: " + checks + " checks");
    }
}
