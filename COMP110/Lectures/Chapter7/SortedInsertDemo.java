import java.util.Arrays;

/**
 * COMP 110 - Chapter 7: Arrays
 * Slides 27
 * Assumptions: 0 <= size < values.length. The used prefix is sorted in ascending order.
 */
public class SortedInsertDemo {
    static int insertSorted(int[] values, int size, int key) {
        int i = size;
        while (i > 0 && values[i - 1] > key) {
            values[i] = values[i - 1];
            i--;
        }
        values[i] = key;
        return size + 1;
    }

    public static void main(String[] args) {
        int[] values = {10, 30, 40, 0, 0};
        int size = 3;
        size = insertSorted(values, size, 20);
        System.out.println(Arrays.toString(
            Arrays.copyOf(values, size)));
    }
}
