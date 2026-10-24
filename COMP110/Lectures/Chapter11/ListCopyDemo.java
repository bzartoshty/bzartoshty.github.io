import java.util.*;

/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 51
 */
public class ListCopyDemo {
    public static void main(String[] args) {
        ArrayList<Circle> original = new ArrayList<>();
        original.add(new Circle(2));
        ArrayList<Circle> copy = new ArrayList<>(original);
        original.get(0).setRadius(3);
        original.add(new Circle(4));
        System.out.println(original.size() + " " + copy.size());
        System.out.println(copy.get(0).getRadius());
    }
}
