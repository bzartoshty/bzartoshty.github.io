/**
 * COMP 110 - Chapter 3: Selections
 * Slides 44
 * Minimum Java version for this source: 8
 */
public class ShortCircuitTrace {
    public static void main(String[] args) {
        int checks = 0;
        boolean first = true || (++checks > 0);
        System.out.println(first + " " + checks);
        boolean second = false && (++checks > 0);
        System.out.println(second + " " + checks);
        boolean third = true ^ (++checks > 0);
        System.out.println(third + " " + checks);
    }
}
