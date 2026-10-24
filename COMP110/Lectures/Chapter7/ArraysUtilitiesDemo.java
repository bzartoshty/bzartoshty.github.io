import java.util.Arrays;

/**
 * COMP 110 - Chapter 7: Arrays
 * Slides 53
 */
public class ArraysUtilitiesDemo {
    public static void main(String[] args) {
        int[] values = {6, 4, 1, 2};
        Arrays.sort(values);
        int[] copy = Arrays.copyOf(values, values.length);
        System.out.println(Arrays.toString(values));
        System.out.println(Arrays.equals(values, copy));
        System.out.println(values == copy);
    }
}
