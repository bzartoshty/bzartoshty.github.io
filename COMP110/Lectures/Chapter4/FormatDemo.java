import java.util.Locale;

/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 42
 */
public class FormatDemo {
    public static void main(String[] args) {
        System.out.printf(Locale.US, "%-10s%5s%9s%n",
            "Item", "Qty", "Price");
        System.out.printf(Locale.US, "%-10s%5d%9.2f%n",
            "Notebook", 3, 4.5);
        System.out.printf(Locale.US, "%-10s%5d%9.2f%n",
            "Pen", 12, 1.25);
    }
}
