import java.util.Locale;

/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 3
 */
public class MathBasics {
    public static void main(String[] args) {
        double radius = 2;
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf(Locale.US, "Area: %.5f%n", area);
        System.out.printf(Locale.US, "E: %.5f%n", Math.E);
    }
}
