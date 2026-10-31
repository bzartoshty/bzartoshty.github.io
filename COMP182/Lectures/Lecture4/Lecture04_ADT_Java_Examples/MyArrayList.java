import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/** Teaching implementation: ordered, duplicates and null allowed. */
public class MyArrayList<E> implements MyList<E> {
    private Object[] data = new Object[4];
    private int size;
    private int modCount;

    public MyArrayList() { }
    public MyArrayList(E[] values) {
        data = Arrays.copyOf(values, Math.max(4, values.length), Object[].class);
        size = values.length;
    }
    public int size() { return size; }
    /** Diagnostic only; capacity is not part of the MyList ADT. */
    public int capacity() { return data.length; }
    private void checkElementIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("index=" + index + ", size=" + size);
    }
    private void checkPositionIndex(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("index=" + index + ", size=" + size);
    }
    @SuppressWarnings("unchecked")
    public E get(int index) {
        checkElementIndex(index);
        return (E) data[index]; // Only E values enter through add/set.
    }
    public E set(int index, E value) {
        E old = get(index);
        data[index] = value;
        return old;
    }
    private void ensureCapacity(int minimum) {
        if (minimum <= data.length) return;
        int grown = Math.max(minimum, Math.max(1, data.length * 2));
        data = Arrays.copyOf(data, grown);
    }
    public void add(int index, E value) {
        checkPositionIndex(index);
        ensureCapacity(size + 1);
        for (int j = size; j > index; j--) data[j] = data[j - 1];
        data[index] = value;
        size++;
        modCount++;
    }
    public E remove(int index) {
        E old = get(index);
        for (int j = index; j < size - 1; j++) data[j] = data[j + 1];
        data[--size] = null; // Release the unused reference.
        modCount++;
        return old;
    }
    public int indexOf(Object value) {
        for (int i = 0; i < size; i++)
            if (Objects.equals(value, data[i])) return i;
        return -1;
    }
    public int lastIndexOf(Object value) {
        for (int i = size - 1; i >= 0; i--)
            if (Objects.equals(value, data[i])) return i;
        return -1;
    }
    public void trimToSize() {
        if (size != data.length) {
            data = Arrays.copyOf(data, size);
            modCount++;
        }
    }
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int cursor;
            private int lastReturned = -1;
            private int expectedModCount = modCount;
            private void checkModification() {
                if (expectedModCount != modCount)
                    throw new ConcurrentModificationException();
            }
            public boolean hasNext() { checkModification(); return cursor < size; }
            public E next() {
                checkModification();
                if (cursor >= size) throw new NoSuchElementException();
                lastReturned = cursor;
                return get(cursor++);
            }
            public void remove() {
                checkModification();
                if (lastReturned < 0) throw new IllegalStateException();
                MyArrayList.this.remove(lastReturned);
                cursor = lastReturned;
                lastReturned = -1;
                expectedModCount = modCount;
            }
        };
    }
    public String toString() { return Arrays.toString(Arrays.copyOf(data, size)); }
}
