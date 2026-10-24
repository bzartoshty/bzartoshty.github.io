import java.util.Arrays;

/**
 * COMP 110 - Chapter 7: Arrays
 * Slides 6
 */
public class ArrayInitializerDemo {
    public static void main(String[] args) {
        double[] values = {1.9, 2.9, 3.4, 3.5};
        System.out.println(values.length);
        values = new double[]{8.0, 9.0};
        System.out.println(Arrays.toString(values));
        // values = {8.0, 9.0}; // Does not compile.
    }
}
