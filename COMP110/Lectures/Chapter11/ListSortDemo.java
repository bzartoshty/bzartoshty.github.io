import java.util.*;

/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 54
 * Assumptions: Nonempty list of non-null comparable values.
 */
public class ListSortDemo {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(
            Arrays.asList("red", "green", "blue"));
        Collections.sort(colors);
        System.out.println(colors);
        System.out.println(Collections.min(colors));
        System.out.println(Collections.max(colors));
    }
}
