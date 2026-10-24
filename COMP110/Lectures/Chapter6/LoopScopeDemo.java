/**
 * COMP 110 - Chapter 6: Methods
 * Slides 34-35: Demonstrate loop-header and loop-body variable scopes.
 * Run: java LoopScopeDemo
 */
public class LoopScopeDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            int doubled = i * 2;
            System.out.println(doubled);
        }
        // System.out.println(i);       // error
        // System.out.println(doubled); // error
    }
}
