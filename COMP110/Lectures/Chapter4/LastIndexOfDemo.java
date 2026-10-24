/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 64
 */
public class LastIndexOfDemo {
    public static void main(String[] args) {
        String text = "banana";
        System.out.println(text.lastIndexOf('a'));
        System.out.println(text.lastIndexOf('a', 3));
        System.out.println(text.lastIndexOf("ana"));
        System.out.println(text.lastIndexOf("ana", 1));
    }
}
