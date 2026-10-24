import java.util.*;

/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 52
 */
public class ArrayListFromArrayDemo {
    public static void main(String[] args) {
        String[] array = {"red", "green", "blue"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
        list.set(0, "black");
        String[] result = list.toArray(new String[0]);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(result));
    }
}
