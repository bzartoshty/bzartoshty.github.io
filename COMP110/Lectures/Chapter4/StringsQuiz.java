import java.util.Locale;

/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 52
 */
public class StringsQuiz {
    public static void main(String[] args) {
        String text = "Java";
        System.out.println(text.length());
        System.out.println(text.charAt(0));
        System.out.println(text.charAt(3));
        System.out.println("".length());
        text.toUpperCase(Locale.ROOT);
        System.out.println(text);
    }
}
