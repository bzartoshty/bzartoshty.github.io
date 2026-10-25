/**
 * COMP 182 - Priority Queues and Binary Heaps
 * Slides 10
 * Min-heap; non-null comparable entries; empty peek/remove return null.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class MinHeap<T extends Comparable<? super T>> {
    private final ArrayList<T> list = new ArrayList<>();

    public MinHeap() { }

    /** Copies entries and builds the heap bottom up in O(n). */
    public MinHeap(Collection<? extends T> entries) {
        Objects.requireNonNull(entries, "entries");
        for (T entry : entries)
            list.add(Objects.requireNonNull(entry, "entry"));
        for (int i = list.size() / 2 - 1; i >= 0; i--)
            heapRebuild(i);
    }

    public void add(T newItem) {
        list.add(Objects.requireNonNull(newItem, "newItem"));
        int i = list.size() - 1;
        while (i > 0) {
            int parent = (i - 1) / 2;
            if (list.get(i).compareTo(list.get(parent)) >= 0)
                break;
            Collections.swap(list, i, parent);
            i = parent;
        }
    }

    /** Returns the root, or null when empty; no array shrinking. */
    public T remove() {
        if (list.isEmpty()) return null;
        T result = list.get(0);
        T last = list.remove(list.size() - 1);
        if (!list.isEmpty()) {
            list.set(0, last);
            heapRebuild(0);
        }
        return result;
    }

    public T peek() { return list.isEmpty() ? null : list.get(0); }
    public int size() { return list.size(); }
    public boolean isEmpty() { return list.isEmpty(); }
    public void clear() { list.clear(); }

    /** Independent unmodifiable level-order snapshot; elements are shared. */
    public List<T> snapshot() { return List.copyOf(list); }

    private void heapRebuild(int root) {
        int n = list.size();
        while (root < n / 2) {
            int child = 2 * root + 1;
            if (child + 1 < n &&
                list.get(child + 1).compareTo(list.get(child)) < 0)
                child++;
            if (list.get(root).compareTo(list.get(child)) <= 0)
                break;
            Collections.swap(list, root, child);
            root = child;
        }
    }
}
