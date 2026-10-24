/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 62
 */
public class SubstringDemo {
    public static void main(String[] args) {
        String text = "Welcome to Java";
        System.out.println(text.substring(0, 7));
        System.out.println(text.substring(11));
        System.out.println(text.substring(7, 7).length());
        System.out.println(text.substring(text.length()).length());
    }
}
