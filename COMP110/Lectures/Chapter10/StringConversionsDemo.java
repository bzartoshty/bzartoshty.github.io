import java.util.Locale;

/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 49
 */
public class StringConversionsDemo {
    public static void main(String[] args) {
        String text = "  Java  ";
        System.out.println(text.trim().toUpperCase(Locale.ROOT));
        char[] letters = "Java".toCharArray();
        letters[0] = 'L';
        System.out.println(new String(letters));
        System.out.println(String.valueOf(42));
        System.out.println(String.valueOf('A'));
    }
}
