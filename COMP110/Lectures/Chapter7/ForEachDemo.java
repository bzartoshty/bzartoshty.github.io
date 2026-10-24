import java.util.Arrays;

/**
 * COMP 110 - Chapter 7: Arrays
 * Slides 12
 */
public class ForEachDemo {
    public static void main(String[] args) {
        int[] values = {4, 7, 2};
        for (int value : values) {
            value *= 2;
        }
        System.out.println(Arrays.toString(values));
        for (int value : values) {
            System.out.println(value);
        }
    }
}
