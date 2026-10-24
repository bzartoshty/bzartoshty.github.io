import java.util.*;

/**
 * COMP 110 - Chapter 11: Inheritance and Polymorphism
 * Slides 19
 */
public class CylinderDemo {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(2, 3);
        System.out.printf(Locale.US, "Volume: %.2f%n",
        cylinder.getVolume());
    }
}
