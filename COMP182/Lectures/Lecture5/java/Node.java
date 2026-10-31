/** Small mutable node used by the reference and recursion examples. */
public final class Node<E> {
    E element;
    Node<E> next;
    public Node(E element) { this.element = element; }
}
