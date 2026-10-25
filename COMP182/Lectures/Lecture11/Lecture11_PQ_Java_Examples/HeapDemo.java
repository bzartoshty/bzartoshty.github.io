/**
 * COMP 182 - Priority Queues and Binary Heaps
 * Slides 12, 13, 14, 15, 16, 17, 19, 21, 22, 23, 24, 25, 26, 27, 28
 * Reproduces slide insertion and deletion sequences using level-order snapshots.
 */
import java.util.Arrays;
public class HeapDemo {
    public static void main(String[] args) {
        MaxHeap<Integer> inserted = new MaxHeap<>();
        for (int x : new int[]{3, 5, 1, 19, 11, 22}) inserted.add(x);
        System.out.println("After six: " + inserted.snapshot());
        inserted.add(88);
        System.out.println("After 88: " + inserted.snapshot());

        MaxHeap<Integer> small = new MaxHeap<>(Arrays.asList(10,9,6,3,2,5));
        System.out.println("Removed: " + small.remove());
        System.out.println("Small heap: " + small.snapshot());

        MaxHeap<Integer> large = new MaxHeap<>(Arrays.asList(
            62,42,59,32,39,44,13,22,29,14,33,30,17,9));
        System.out.println("Removed: " + large.remove());
        System.out.println("Large heap: " + large.snapshot());
    }
}
