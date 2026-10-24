/**
 * COMP 110 - Chapter 7: Arrays
 * Slides 7
 */
public class ArrayIndexDemo {
    public static void main(String[] args) {
        int[] values = {10, 20, 30};
        int last = values.length - 1;
        values[1] += 5;
        System.out.println(values[0]);
        System.out.println(values[last]);
        System.out.println(values[1]);
        // System.out.println(values[3]); // Runtime error.
    }
}
