/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 50
 */
public class LiteralReplacementDemo {
    public static void main(String[] args) {
        String text = "Java Java";
        System.out.println(text.replace("Java", "HTML"));
        System.out.println(text.replace('a', 'o'));
        System.out.println(text);
        System.out.println("a.b".replace(".", "-"));
    }
}
