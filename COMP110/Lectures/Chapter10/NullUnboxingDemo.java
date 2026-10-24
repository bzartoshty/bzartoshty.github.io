/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 42
 */
public class NullUnboxingDemo {
    public static void main(String[] args) {
        Integer missing = null;
        if (missing == null) {
            System.out.println("No numeric value");
        }
        Integer present = 8;
        System.out.println(present + 2);
        // int value = missing; // NullPointerException on unboxing.
    }
}
