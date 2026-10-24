import java.util.Arrays;

/**
 * COMP 110 - Chapter 7: Arrays
 * Slides 22
 */
public class RotateLeftDemo {
    static void rotateLeft(int[] values) {
        if (values.length < 2) return;
        int first = values[0];
        for (int i = 1; i < values.length; i++) {
            values[i - 1] = values[i];
        }
        values[values.length - 1] = first;
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4};
        rotateLeft(values);
        System.out.println(Arrays.toString(values));
    }
}
