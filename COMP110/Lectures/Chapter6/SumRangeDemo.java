/**
 * COMP 110 - Chapter 6: Methods
 * Slides 5-6: Reuse a method with different arguments.
 * Run: java SumRangeDemo
 * Assumptions: start <= end, end < Integer.MAX_VALUE, and the sum fits in int.
 */
public class SumRangeDemo {
    public static int sumRange(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumRange(1, 10));
        System.out.println(sumRange(20, 30));
        System.out.println(sumRange(35, 45));
    }
}
