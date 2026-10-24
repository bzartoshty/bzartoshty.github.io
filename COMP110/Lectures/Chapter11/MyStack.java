import java.util.*;

/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 58, 59
 * Assumptions: Object stack; null pushes rejected; empty peek/pop throw NoSuchElementException. search returns backing-list index from the bottom, or -1.
 */
public class MyStack {
    private final ArrayList<Object> elements = new ArrayList<>();
    public boolean isEmpty() { return elements.isEmpty(); }
    public int getSize() { return elements.size(); }
    public void push(Object value) {
        elements.add(Objects.requireNonNull(value, "value"));
    }

    public Object peek() {
        if (isEmpty()) {
        throw new NoSuchElementException("Empty stack");
    }
        return elements.get(elements.size() - 1);
    }
    public Object pop() {
        if (isEmpty()) {
        throw new NoSuchElementException("Empty stack");
    }
        return elements.remove(elements.size() - 1);
    }
    public int search(Object value) {
        return elements.lastIndexOf(value);
    }
    @Override public String toString() {
        return "stack: " + elements;
    }
}
