/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 58
 */
public class RegexReplacementDemo {
    public static void main(String[] args) {
        String text = "a+b$#c";
        System.out.println(text.replaceAll("[$+#]", "NNN"));
        String words = "Java Java Java";
        System.out.println(words.replaceAll("v\\w", "wi"));
        System.out.println(words.replaceFirst("v\\w", "wi"));
    }
}
