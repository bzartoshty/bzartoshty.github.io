/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 63
 */
public class IndexOfDemo {
    public static void main(String[] args) {
        String text = "banana";
        System.out.println(text.indexOf('a'));
        System.out.println(text.indexOf('a', 1));
        System.out.println(text.indexOf('a', 2));
        System.out.println(text.indexOf("ana"));
        System.out.println(text.indexOf('x'));
    }
}
