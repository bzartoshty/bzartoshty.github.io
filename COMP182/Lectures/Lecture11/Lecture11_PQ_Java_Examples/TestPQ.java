/**
 * COMP 182 - Priority Queues and Binary Heaps
 * Slides 3, 29
 * Custom PQ API; remove returns null when empty, unlike java.util.PriorityQueue.remove().
 */
public class TestPQ {
    public static void main(String[] args) {
        PriorityQueueInterface<Integer> max = new MaxPriorityQueue<>();
        PriorityQueueInterface<Integer> min = new MinPriorityQueue<>();
        for (int x : new int[]{3,5,1,19,11,22,88,5}) {
            max.add(x); min.add(x);
        }
        System.out.print("Max: "); drain(max);
        System.out.print("Min: "); drain(min);
        System.out.println("Empty peek: " + min.peek());
        System.out.println("Empty remove: " + min.remove());
    }
    private static void drain(PriorityQueueInterface<Integer> queue) {
        while (!queue.isEmpty()) System.out.print(queue.remove() + " ");
        System.out.println();
    }
}
