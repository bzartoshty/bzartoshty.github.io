/**
 * COMP 110 - Chapter 6: Methods
 * Slides 36: Reuse a name in separate, nonoverlapping loop scopes.
 * Run: java SeparateLoopScopesDemo
 */
public class SeparateLoopScopesDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println(i);
        }
        for (int i = 5; i <= 6; i++) {
            System.out.println(i);
        }
    }
}
