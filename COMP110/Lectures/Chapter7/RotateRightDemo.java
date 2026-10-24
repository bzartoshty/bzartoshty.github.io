import java.util.Arrays;

/**
 * COMP 110 - Chapter 7: Arrays
 * Slides 23
 */
public class RotateRightDemo {
    static void rotateRight(int[] values) {
        if (values.length < 2) return;
        int last = values[values.length - 1];
        for (int i = values.length - 1; i > 0; i--) {
            values[i] = values[i - 1];
        }
        values[0] = last;
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4};
        rotateRight(values);
        System.out.println(Arrays.toString(values));
    }
}
