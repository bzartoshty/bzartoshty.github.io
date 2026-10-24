import java.util.Arrays;

/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 60
 */
public class RegexSplitDemo {
    public static void main(String[] args) {
        String[] languages = "Java,C?C#,C++".split("[.,:;?]");
        System.out.println(Arrays.toString(languages));
        String[] parts = "one   two".split("\\s+");
        System.out.println(Arrays.toString(parts));
    }
}
