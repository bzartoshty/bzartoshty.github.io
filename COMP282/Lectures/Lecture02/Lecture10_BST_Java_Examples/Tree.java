public interface Tree<E> extends Iterable<E> {
    boolean contains(E key);
    boolean insert(E key);
    boolean delete(E key);
    int size();
}
