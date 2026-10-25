/**
 * COMP 182 - Priority Queues and Binary Heaps
 * Slides 30, 31
 * Heapsort client; includes duplicate and negative values.
 */
import java.util.Arrays;
public class HeapSortTest {
    public static void main(String[] args) {
        int[] values = {3, 5, 1, 19, 11, 22, 88, 5, -2};
        HeapSort.sort(values);
        System.out.println(Arrays.toString(values));
    }
}
