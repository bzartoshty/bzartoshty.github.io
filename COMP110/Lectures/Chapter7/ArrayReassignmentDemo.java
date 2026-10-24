import java.util.Arrays;

/**
 * COMP 110 - Chapter 7: Arrays
 * Slides 36
 */
public class ArrayReassignmentDemo {
    static void replace(int[] values) {
        values = new int[]{9, 9};
    }

    public static void main(String[] args) {
        int[] values = {1, 2};
        replace(values);
        System.out.println(Arrays.toString(values));
    }
}
