import java.util.regex.Matcher;

/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 59
 */
public class RegexLiteralReplacementDemo {
    public static void main(String[] args) {
        String replacement = Matcher.quoteReplacement("$");
        System.out.println("a+b".replaceAll("[+]", replacement));
        System.out.println("a+b".replace("+", "$"));
    }
}
