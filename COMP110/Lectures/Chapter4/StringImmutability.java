import java.util.Locale;

/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 51
 */
public class StringImmutability {
    public static void main(String[] args) {
        String text = "Java";
        text.toUpperCase(Locale.ROOT);
        System.out.println(text);
        text = text.toUpperCase(Locale.ROOT);
        System.out.println(text);
    }
}
