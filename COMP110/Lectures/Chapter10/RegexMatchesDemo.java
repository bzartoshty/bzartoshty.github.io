/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 53
 */
public class RegexMatchesDemo {
    public static void main(String[] args) {
        System.out.println("Java".matches("Java"));
        System.out.println("Java is fun".matches("Java.*"));
        System.out.println("I use Java".matches("Java"));
        System.out.println("I use Java".contains("Java"));
    }
}
