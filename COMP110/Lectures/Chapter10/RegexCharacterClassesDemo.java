/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 54, 55
 */
public class RegexCharacterClassesDemo {
    public static void main(String[] args) {
        System.out.println("Java".matches("J..a"));
        System.out.println("ab".matches("(ab|cd)"));
        System.out.println("b".matches("[abc]"));
        System.out.println("x".matches("[^abc]"));
        System.out.println("d".matches("[a-z]"));
        System.out.println("7".matches("[^a-z]"));
        System.out.println("n".matches("[a-e[m-p]]"));
        System.out.println("d".matches("[a-e&&[c-p]]"));
        System.out.println("7".matches("\\d"));
        System.out.println("_".matches("\\w"));
        System.out.println(" ".matches("\\s"));
    }
}
