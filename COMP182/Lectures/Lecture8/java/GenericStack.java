import java.util.ArrayList;
import java.util.NoSuchElementException;

/** Slides 3, 6-10: composition, with the top at the end of an ArrayList. */
public final class GenericStack<E> {
    private final ArrayList<E> items = new ArrayList<>();
    public int getSize() { return items.size(); }
    public boolean isEmpty() { return items.isEmpty(); }
    public void push(E item) { items.add(item); }
    public E peek() {
        if (isEmpty()) throw new NoSuchElementException("empty stack");
        return items.get(items.size() - 1);
    }
    public E pop() {
        if (isEmpty()) throw new NoSuchElementException("empty stack");
        return items.remove(items.size() - 1);
    }
    public void clear() { items.clear(); }
}
