import java.util.Locale;

/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 4
 */
public class PowersAndRoots {
    public static void main(String[] args) {
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.pow(3, 2));
        System.out.printf(Locale.US, "%.5f%n", Math.pow(3.5, 2.5));
        System.out.println(Math.sqrt(4));
        System.out.printf(Locale.US, "%.2f%n", Math.sqrt(10.5));
        System.out.println(Math.sqrt(-1));
    }
}
