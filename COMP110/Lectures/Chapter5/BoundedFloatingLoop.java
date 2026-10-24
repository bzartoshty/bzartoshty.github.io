import java.util.Locale;

/**
 * COMP 110 - Chapter 5: Loops
 * Slides 22
 * Assumptions: Bounded diagnostic demonstration; the step guard prevents an unending equality loop.
 */
public class BoundedFloatingLoop {
    public static void main(String[] args) {
        double item = 1;
        int steps = 0;
        while (item != 0 && steps < 12) {
            item -= 0.1;
            steps++;
        }
        System.out.println("Steps: " + steps);
        System.out.printf(Locale.US, "Item: %.3f%n", item);
        System.out.println("Reached zero: " + (item == 0));
    }
}
