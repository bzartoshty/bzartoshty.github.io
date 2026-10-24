/**
 * COMP 110 - Chapter 7: Arrays
 * Slides 62
 * Assumptions: values is non-null.
 */
public class CountAboveLimitDemo {
    static int countAbove(int[] values, int limit) {
        int count = 0;
        for (int value : values) {
            if (value > limit) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countAbove(new int[]{2, 7, 7, 1}, 5));
        System.out.println(countAbove(new int[0], 5));
        System.out.println(countAbove(new int[]{5, 5}, 5));
    }
}
