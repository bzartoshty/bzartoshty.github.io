import java.util.Arrays;

/**
 * COMP 110 - Chapter 7: Arrays
 * Slides 54
 */
public class LibraryBinarySearchDemo {
    public static void main(String[] args) {
        int[] values = {2, 4, 7, 10};
        System.out.println(Arrays.binarySearch(values, 7));
        int result = Arrays.binarySearch(values, 8);
        System.out.println(result);
        System.out.println(-result - 1);
    }
}
