/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 56
 */
public class RegexQuantifiersDemo {
    public static void main(String[] args) {
        System.out.println("".matches("a*"));
        System.out.println("a".matches("a+"));
        System.out.println("".matches("a+"));
        System.out.println("a".matches("a?"));
        System.out.println("aa".matches("a{2}"));
        System.out.println("aaa".matches("a{2,}"));
        System.out.println("aaa".matches("a{2,4}"));
    }
}
