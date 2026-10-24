import java.util.*;

/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 53
 */
public class ArraysAsListDemo {
    public static void main(String[] args) {
        String[] array = {"red", "green"};
        List<String> view = Arrays.asList(array);
        view.set(0, "black");
        System.out.println(Arrays.toString(array));
        try { view.add("blue"); }
        catch (UnsupportedOperationException ex) {
            System.out.println("Fixed-size view");
        }
        ArrayList<String> copy = new ArrayList<>(view);
        copy.add("blue");
        System.out.println(copy);
    }
}
