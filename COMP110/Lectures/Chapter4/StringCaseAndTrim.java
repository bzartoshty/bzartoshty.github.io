import java.util.Locale;

/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 50
 */
public class StringCaseAndTrim {
    public static void main(String[] args) {
        String original = "  Java  ";
        String trimmed = original.trim();
        System.out.println("[" + trimmed + "]");
        System.out.println(trimmed.toUpperCase(Locale.ROOT));
        System.out.println(trimmed.toLowerCase(Locale.ROOT));
        System.out.println("[" + original + "]");
    }
}
