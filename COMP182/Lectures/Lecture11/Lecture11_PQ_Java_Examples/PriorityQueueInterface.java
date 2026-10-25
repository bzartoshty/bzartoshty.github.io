/**
 * COMP 182 - Priority Queues and Binary Heaps
 * Slides 3
 * Natural order; null entries rejected; remove and peek return null when empty.
 */
public interface PriorityQueueInterface<T
        extends Comparable<? super T>> {
    boolean add(T newEntry);
    T remove();
    T peek();
    boolean isEmpty();
    int size();
    void clear();
}
