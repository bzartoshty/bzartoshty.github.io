import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/** Teaching list with head, tail and size. Null elements are permitted. */
public final class SinglyLinkedList<E> implements Iterable<E> {
    private static final class Node<E> {
        E element;
        Node<E> next;
        Node(E element) { this.element = element; }
    }
    private Node<E> head;
    private Node<E> tail;
    private int size;
    private int modCount;
    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }
    private void checkIndex(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("index=" + index);
    }
    private Node<E> nodeAt(int index) {
        checkIndex(index);
        Node<E> current = head;
        for (int i = 0; i < index; i++) current = current.next;
        return current;
    }
    public E get(int index) { return nodeAt(index).element; }
    public void addFirst(E e) {
        Node<E> n = new Node<>(e);
        n.next = head;
        head = n;
        if (tail == null) tail = n;
        size++; modCount++;
    }
    public void addLast(E e) {
        Node<E> n = new Node<>(e);
        if (tail == null) head = n;
        else tail.next = n;
        tail = n;
        size++; modCount++;
    }
    public void add(int index, E e) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException("index=" + index);
        if (index == 0) addFirst(e);
        else if (index == size) addLast(e);
        else {
            Node<E> prev = nodeAt(index - 1);
            Node<E> n = new Node<>(e);
            n.next = prev.next;
            prev.next = n;
            size++; modCount++;
        }
    }
    public E removeFirst() {
        if (head == null) throw new NoSuchElementException();
        E value = head.element;
        head = head.next;
        if (head == null) tail = null;
        size--; modCount++;
        return value;
    }
    public E removeLast() {
        if (head == null) throw new NoSuchElementException();
        if (head == tail) return removeFirst();
        Node<E> prev = head;
        while (prev.next != tail) prev = prev.next;
        E value = tail.element;
        prev.next = null;
        tail = prev;
        size--; modCount++;
        return value;
    }
    public E remove(int index) {
        checkIndex(index);
        if (index == 0) return removeFirst();
        Node<E> prev = nodeAt(index - 1);
        Node<E> victim = prev.next;
        prev.next = victim.next;
        if (victim == tail) tail = prev;
        size--; modCount++;
        return victim.element;
    }
    /** Checks structural invariants for teaching and testing. O(n). */
    public void checkInvariants() {
        if (size == 0) {
            if (head != null || tail != null) throw new AssertionError("empty endpoints");
            return;
        }
        if (head == null || tail == null || tail.next != null) throw new AssertionError("endpoints");
        int count = 0; Node<E> last = null;
        for (Node<E> n = head; n != null; n = n.next) {
            if (++count > size) throw new AssertionError("cycle or wrong size");
            last = n;
        }
        if (count != size || last != tail) throw new AssertionError("size or tail");
    }
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node<E> cursor = head;
            private final int expected = modCount;
            private void checkModification() {
                if (expected != modCount) throw new ConcurrentModificationException();
            }
            public boolean hasNext() { checkModification(); return cursor != null; }
            public E next() {
                checkModification();
                if (cursor == null) throw new NoSuchElementException();
                E value = cursor.element; cursor = cursor.next; return value;
            }
            // Iterator.remove() uses its default unsupported implementation.
        };
    }
    public String toString() {
        StringBuilder b = new StringBuilder("[");
        for (Node<E> n = head; n != null; n = n.next) {
            if (n != head) b.append(", ");
            b.append(n.element);
        }
        return b.append(']').toString();
    }
}
