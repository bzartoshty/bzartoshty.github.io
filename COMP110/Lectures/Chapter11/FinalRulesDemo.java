import java.util.*;

/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 68
 */
public class FinalRulesDemo {
    static final class Token { }
    static class Parent {
        public final String id() { return "fixed"; }
    }
    // class Child extends Token { } // final class cannot be extended
    // An inherited final id() cannot be overridden.

    public static void main(String[] args) {
        final int limit = 3;
        final ArrayList<String> names = new ArrayList<>();
        names.add("Java");
        System.out.println(limit);
        System.out.println(names);
        // names = new ArrayList<>(); // cannot reassign
        // limit = 4; // cannot reassign
    }
}
