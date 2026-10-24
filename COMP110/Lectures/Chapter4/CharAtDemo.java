/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 48
 */
public class CharAtDemo {
    public static void main(String[] args) {
        String text = "Java";
        System.out.println(text.charAt(0));
        System.out.println(text.charAt(text.length() - 1));
        // text.charAt(4); // invalid: index equals length
        // "".charAt(0);   // invalid: empty string
    }
}
