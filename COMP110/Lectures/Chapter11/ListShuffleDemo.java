import java.util.*;

/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 55
 * Assumptions: Fixed seed for reproducible classroom runs; verify size and element multiplicities, not a portable mandated order.
 */
public class ListShuffleDemo {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>(
            Arrays.asList(3, 5, 95, 4, 15, 34, 3, 6, 5));
        Collections.shuffle(values, new Random(7));
        System.out.println(values);
    }
}
