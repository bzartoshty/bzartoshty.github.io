/**
 * COMP 110 - Chapter 6: Methods
 * Slides 7-8, 10: Identify parameters, arguments, and returned values.
 * Run: java MaxDemo
 */
public class MaxDemo {
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static void main(String[] args) {
        int larger = max(7, 12);
        int total = 3 + max(4, 9);
        System.out.println(larger);
        System.out.println(total);
    }
}
