import java.util.NoSuchElementException;

/** Linear doubly linked teaching list. Node handles remain private. */
public final class DoublyLinkedList<E> {
    private static final class Node<E> {
        E element;
        Node<E> next;
        Node<E> previous;
        Node(E element) { this.element = element; }
    }
    private Node<E> head;
    private Node<E> tail;
    private int size;
    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }
    private Node<E> nodeAt(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("index=" + index);
        if (index < size / 2) {
            Node<E> n = head;
            for (int i = 0; i < index; i++) n = n.next;
            return n;
        }
        Node<E> n = tail;
        for (int i = size - 1; i > index; i--) n = n.previous;
        return n;
    }
    public E get(int index) { return nodeAt(index).element; }
    public void addFirst(E e) {
        Node<E> n = new Node<>(e);
        n.next = head;
        if (head == null) tail = n;
        else head.previous = n;
        head = n; size++;
    }
    public void addLast(E e) {
        Node<E> n = new Node<>(e);
        n.previous = tail;
        if (tail == null) head = n;
        else tail.next = n;
        tail = n; size++;
    }
    public void add(int index, E e) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException("index=" + index);
        if (index == size) addLast(e);
        else insertBefore(nodeAt(index), e);
    }
    // Precondition: curr belongs to this list. Only internal methods supply it.
    private void insertBefore(Node<E> curr, E e) {
        Node<E> n = new Node<>(e);
        n.previous = curr.previous;
        n.next = curr;
        if (curr.previous == null) head = n;
        else curr.previous.next = n;
        curr.previous = n; size++;
    }
    public E removeFirst() {
        if (head == null) throw new NoSuchElementException();
        return unlink(head);
    }
    public E removeLast() {
        if (tail == null) throw new NoSuchElementException();
        return unlink(tail);
    }
    public E remove(int index) { return unlink(nodeAt(index)); }
    // Precondition: curr belongs to this list.
    private E unlink(Node<E> curr) {
        Node<E> p = curr.previous;
        Node<E> q = curr.next;
        if (p == null) head = q; else p.next = q;
        if (q == null) tail = p; else q.previous = p;
        E value = curr.element;
        curr.next = curr.previous = null;
        size--;
        return value;
    }
    public void checkInvariants() {
        if (size == 0) {
            if (head != null || tail != null) throw new AssertionError("empty endpoints");
            return;
        }
        if (head == null || tail == null || head.previous != null || tail.next != null)
            throw new AssertionError("endpoints");
        int count = 0; Node<E> prev = null;
        for (Node<E> n = head; n != null; n = n.next) {
            if (++count > size || n.previous != prev) throw new AssertionError("forward links");
            prev = n;
        }
        if (count != size || prev != tail) throw new AssertionError("size or tail");
        count = 0; Node<E> next = null;
        for (Node<E> n = tail; n != null; n = n.previous) {
            if (++count > size || n.next != next) throw new AssertionError("backward links");
            next = n;
        }
        if (count != size || next != head) throw new AssertionError("size or head");
    }
    public String toString() { return format(false); }
    public String reverseString() { return format(true); }
    private String format(boolean reverse) {
        StringBuilder b = new StringBuilder("[");
        Node<E> n = reverse ? tail : head;
        boolean first = true;
        while (n != null) {
            if (!first) b.append(", ");
            b.append(n.element); first = false;
            n = reverse ? n.previous : n.next;
        }
        return b.append(']').toString();
    }
}
