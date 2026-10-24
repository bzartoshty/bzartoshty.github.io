import java.util.*;

/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 32
 */
public class BoxedArrayDemo {
    public static void printArray(Object[] values) {
        for (Object value : values) System.out.print(value + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] integers = {12, 24};
        Double[] decimals = {12.4, 24.0};
        int[] primitives = {1, 2, 3};
        printArray(integers);
        printArray(decimals);
        System.out.println(Arrays.toString(primitives));
        // printArray(primitives); // int[] is not an Object[]
    }
}
