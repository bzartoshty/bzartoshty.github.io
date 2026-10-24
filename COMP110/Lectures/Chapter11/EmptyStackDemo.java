import java.util.*;

/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 61
 */
public class EmptyStackDemo {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        try { stack.pop(); }
        catch (NoSuchElementException ex) {
            System.out.println("Empty pop rejected");
        }
        try { stack.push(null); }
        catch (NullPointerException ex) {
            System.out.println("Null push rejected");
        }
        System.out.println(stack.isEmpty());
    }
}
