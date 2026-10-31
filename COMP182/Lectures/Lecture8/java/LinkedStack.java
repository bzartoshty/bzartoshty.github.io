import java.util.NoSuchElementException;

/** Slides 6-7: the head is the top, so push, pop, and peek take O(1). */
public final class LinkedStack<E> {
    private static final class Node<E> {
        final E value;
        final Node<E> next;
        Node(E value, Node<E> next) { this.value = value; this.next = next; }
    }
    private Node<E> head;
    private int size;
    public int getSize() { return size; }
    public boolean isEmpty() { return head == null; }
    public void push(E value) { head = new Node<>(value, head); size++; }
    public E peek() {
        if (isEmpty()) throw new NoSuchElementException("empty stack");
        return head.value;
    }
    public E pop() {
        E result = peek();
        head = head.next;
        size--;
        return result;
    }
    public void clear() { head = null; size = 0; }
}
