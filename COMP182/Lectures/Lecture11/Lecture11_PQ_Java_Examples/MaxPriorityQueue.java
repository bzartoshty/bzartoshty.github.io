/**
 * COMP 182 - Priority Queues and Binary Heaps
 * Slides 29
 * Course ADT adapter; maximum first; no FIFO guarantee for equal keys.
 */
public class MaxPriorityQueue<T extends Comparable<? super T>>
        implements PriorityQueueInterface<T> {
    private final MaxHeap<T> heap = new MaxHeap<>();

    @Override public boolean add(T newEntry) {
        heap.add(newEntry);
        return true;
    }
    @Override public T remove() { return heap.remove(); }
    @Override public T peek() { return heap.peek(); }
    @Override public boolean isEmpty() { return heap.isEmpty(); }
    @Override public int size() { return heap.size(); }
    @Override public void clear() { heap.clear(); }
}
