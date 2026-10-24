import java.util.*;

/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 49
 */
public class ListIterationDemo {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>(
        Arrays.asList(1, 2, 4, 5));
        for (int i = values.size() - 1; i >= 0; i--) {
            if (values.get(i) % 2 == 0) values.remove(i);
        }
        System.out.println(values);
    }
}
