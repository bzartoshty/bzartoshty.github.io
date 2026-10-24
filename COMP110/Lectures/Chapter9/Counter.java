/**
 * COMP 110 - Chapter 9: Objects and Classes
 * Slides 64
 * Assumptions: increment throws ArithmeticException rather than wrapping if count reaches Integer.MAX_VALUE.
 */
public class Counter {
    private int count;

    public void increment() {
        count = Math.incrementExact(count);
    }

    public void reset() {
        count = 0;
    }

    public int getCount() {
        return count;
    }
}
