/**
 * COMP 110 - Chapter 7: Arrays
 * Slides 38
 */
public class AnonymousArrayDemo {
    static void printArray(int[] values) {
        for (int value : values) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        printArray(new int[]{3, 1, 2, 6});
    }
}
