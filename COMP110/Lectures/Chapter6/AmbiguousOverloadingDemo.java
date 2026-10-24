/**
 * COMP 110 - Chapter 6: Methods
 * Slides 32-33: Keep an ambiguous call as a commented exercise and show repairs.
 * Run: java AmbiguousOverloadingDemo
 */
public class AmbiguousOverloadingDemo {
    static double max(int a, double b) {
        return a > b ? a : b;
    }
    static double max(double a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        // Uncomment to see the intentional compilation error:
        // System.out.println(max(1, 2));

        System.out.println(max(1, 2.0)); // Selects max(int, double).
        System.out.println(max(1.0, 2)); // Selects max(double, int).

        // Return type alone cannot distinguish overloads.
        // static int f(int x) and static double f(int x) cannot coexist.
    }
}
