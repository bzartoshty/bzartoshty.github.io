/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 45
 */
public class StringBasicsDemo {
    public static void main(String[] args) {
        String text = "Welcome to Java";
        System.out.println(text.length());
        System.out.println(text.charAt(0));
        System.out.println(text.substring(11));
        System.out.println(text.substring(0, 7));
        System.out.println("COMP ".concat("110"));
    }
}
