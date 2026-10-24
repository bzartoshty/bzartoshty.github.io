import java.util.Locale;

/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 66
 */
public class BuilderStringBoundaryDemo {
    static void printUpper(String text) {
        System.out.println(text.toUpperCase(Locale.ROOT));
    }

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Java");
        printUpper(builder.toString());
        // printUpper(builder); // A StringBuilder is not a String.
    }
}
