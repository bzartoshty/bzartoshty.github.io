/** A teaching subset of a list ADT, not the full java.util.List contract. */
public interface MyList<E> extends Iterable<E> {
    int size();
    E get(int index);
    E set(int index, E value);
    void add(int index, E value);
    E remove(int index);
    int indexOf(Object value);
    int lastIndexOf(Object value);
    default void add(E value) { add(size(), value); }
    default boolean isEmpty() { return size() == 0; }
    default boolean contains(Object value) { return indexOf(value) >= 0; }
}
