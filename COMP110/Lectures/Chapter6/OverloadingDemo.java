/**
 * COMP 110 - Chapter 6: Methods
 * Slides 30-31: Select between int and double overloads.
 * Run: java OverloadingDemo
 */
public class OverloadingDemo {
    static int max(int a, int b) {
        return a > b ? a : b;
    }
    static double max(double a, double b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        System.out.println(max(3, 5));
        System.out.println(max(3.0, 5.0));
        System.out.println(max(3, 5.0));
    }
}
