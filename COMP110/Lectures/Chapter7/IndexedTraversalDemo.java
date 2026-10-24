/**
 * COMP 110 - Chapter 7: Arrays
 * Slides 11
 */
public class IndexedTraversalDemo {
    public static void main(String[] args) {
        int[] values = {4, 7, 2};
        for (int i = 0; i < values.length; i++) {
            values[i] *= 2;
            System.out.println(i + ": " + values[i]);
        }
    }
}
