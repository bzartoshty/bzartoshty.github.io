import java.util.*;

/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 48
 */
public class ListRemovalDemo {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>(
        Arrays.asList(1, 2, 3, 2));
        values.remove(2);
        System.out.println(values);
        values.remove(Integer.valueOf(2));
        System.out.println(values);
    }
}
