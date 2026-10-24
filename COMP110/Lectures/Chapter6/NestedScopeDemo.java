/**
 * COMP 110 - Chapter 6: Methods
 * Slides 37: Repair a nested local-variable redeclaration.
 * Run: java NestedScopeDemo
 */
public class NestedScopeDemo {
    public static void main(String[] args) {
        int x = 1;
        if (x > 0) {
            // int x = 0; // Intentional error: x is already a local in scope.
            x = 0;        // Repair: assign to the existing x.
            System.out.println(x);
        }
    }
}
