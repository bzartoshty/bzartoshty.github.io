import java.util.Arrays;

/**
 * COMP 110 - Chapter 7: Arrays
 * Slides 26
 * Assumptions: 0 < size <= values.length and 0 <= index < size.
 */
public class DeleteElementDemo {
    static int deleteAt(int[] values, int size, int index) {
        for (int i = index; i < size - 1; i++) {
            values[i] = values[i + 1];
        }
        values[size - 1] = 0;
        return size - 1;
    }

    public static void main(String[] args) {
        int[] values = {10, 20, 30, 40, 0};
        int size = 4;
        size = deleteAt(values, size, 1);
        System.out.println(Arrays.toString(
            Arrays.copyOf(values, size)));
    }
}
