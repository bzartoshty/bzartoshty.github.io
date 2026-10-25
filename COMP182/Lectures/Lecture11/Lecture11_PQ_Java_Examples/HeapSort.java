/**
 * COMP 182 - Priority Queues and Binary Heaps
 * Slides 30
 * Iterative primitive-array heapsort; no auxiliary collection or recursive calls.
 */
import java.util.Objects;

public final class HeapSort {
    private HeapSort() { }

    /** Ascending in-place sort; non-null array. Unstable, O(1) extra space. */
    public static void sort(int[] a) {
        Objects.requireNonNull(a, "a");
        for (int root = a.length / 2 - 1; root >= 0; root--)
            siftDown(a, root, a.length);
        for (int end = a.length - 1; end > 0; end--) {
            swap(a, 0, end);
            siftDown(a, 0, end);
        }
    }

    // size is the exclusive end of the active heap.
    private static void siftDown(int[] a, int root, int size) {
        while (root < size / 2) {
            int child = 2 * root + 1;
            if (child + 1 < size && a[child + 1] > a[child]) child++;
            if (a[root] >= a[child]) break;
            swap(a, root, child);
            root = child;
        }
    }

    private static void swap(int[] a, int i, int j) {
        int value = a[i]; a[i] = a[j]; a[j] = value;
    }
}
