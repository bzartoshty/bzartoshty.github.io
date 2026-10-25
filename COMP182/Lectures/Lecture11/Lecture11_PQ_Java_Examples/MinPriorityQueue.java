/**
 * COMP 182 - Priority Queues and Binary Heaps
 * Slides 29
 * Course ADT adapter; minimum first; no FIFO guarantee for equal keys.
 */
public class MinPriorityQueue<T extends Comparable<? super T>>
        implements PriorityQueueInterface<T> {
    private final MinHeap<T> heap = new MinHeap<>();

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
