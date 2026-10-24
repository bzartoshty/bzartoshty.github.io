/**
 * COMP 110 - Chapter 6: Methods
 * Slides 20: Assign a returned value in the caller.
 * Run: java IncrementReturnDemo
 * Assumptions: value + 1 fits in int.
 */
public class IncrementReturnDemo {
    static int incremented(int value) {
        return value + 1;
    }

    public static void main(String[] args) {
        int x = 1;
        x = incremented(x);
        System.out.println(x);
    }
}
