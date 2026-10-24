import java.util.Arrays;

/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 57
 */
public class RegexEscapeDemo {
    public static void main(String[] args) {
        String digits = "\\d+";
        System.out.println("42".matches(digits));
        System.out.println(Arrays.toString(
            "Java1HTML2Perl".split("\\d")));
        System.out.println("a.b".matches("a\\.b"));
    }
}
