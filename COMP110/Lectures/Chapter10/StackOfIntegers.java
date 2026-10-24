import java.util.Arrays;

/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 32, 33, 34, 35, 36
 * Assumptions: Initial capacity is positive. peek/pop reject empty input. Growth requires an int-sized capacity and available memory.
 */
public class StackOfIntegers {
    private int[] elements;
    private int size;

    public StackOfIntegers() { this(16); }

    public StackOfIntegers(int capacity) {
        if (capacity < 1) {
            throw new IllegalArgumentException("Invalid capacity");
        }
        elements = new int[capacity];
    }

    public boolean empty() { return size == 0; }
    public int getSize() { return size; }
    public int getCapacity() { return elements.length; }

    public int peek() {
        if (empty()) throw new IllegalStateException("Empty stack");
        return elements[size - 1];
    }

    public void push(int value) {
        if (size == elements.length) {
            int capacity = Math.multiplyExact(elements.length, 2);
            elements = Arrays.copyOf(elements, capacity);
        }
        elements[size++] = value;
    }

    public int pop() {
        if (empty()) throw new IllegalStateException("Empty stack");
        return elements[--size];
    }
}
