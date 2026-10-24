import java.util.*;

/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 46, 47
 */
public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("London");
        cities.add("Paris");
        cities.add(1, "Tokyo");
        System.out.println(cities);
        System.out.println(cities.get(0));
        System.out.println(cities.set(1, "Oslo"));
        System.out.println(cities.contains("Paris"));
        System.out.println(cities.indexOf("Paris"));
        System.out.println(cities.remove("London"));
        System.out.println(cities.remove(0));
        System.out.println(cities);
        cities.clear();
        System.out.println(cities.size());
    }
}
