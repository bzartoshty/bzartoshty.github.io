import java.util.Arrays;

/**
 * COMP 110 - Chapter 7: Arrays
 * Slides 39
 */
public class ReverseArrayDemo {
    static int[] reverse(int[] values) {
        int[] result = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            result[i] = values[values.length - 1 - i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] reversed = reverse(original);
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(reversed));
    }
}
