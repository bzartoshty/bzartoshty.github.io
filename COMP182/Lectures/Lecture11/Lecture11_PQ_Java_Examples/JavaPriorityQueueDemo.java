/**
 * COMP 182 - Priority Queues and Binary Heaps
 * Slides 32
 * JDK min queue and reverse comparator; rejects null and has no FIFO tie guarantee.
 */
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;

public class JavaPriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        for (int x : new int[]{3,5,1,19,11,22,88,5}) {
            min.offer(x); max.offer(x);
        }
        System.out.print("Min: "); drain(min);
        System.out.print("Max: "); drain(max);
        System.out.println("Empty poll: " + min.poll());
        System.out.println("Empty peek: " + min.peek());
        try { min.remove(); }
        catch (NoSuchElementException ex) { System.out.println("remove throws"); }
        try { min.element(); }
        catch (NoSuchElementException ex) { System.out.println("element throws"); }
    }
    private static void drain(PriorityQueue<Integer> queue) {
        // Iteration order is unspecified; repeated poll gives priority order.
        while (!queue.isEmpty()) System.out.print(queue.poll() + " ");
        System.out.println();
    }
}
