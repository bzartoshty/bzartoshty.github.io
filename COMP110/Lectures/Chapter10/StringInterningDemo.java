/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 47
 */
public class StringInterningDemo {
    public static void main(String[] args) {
        String first = "Java";
        String distinct = new String("Java");
        String literal = "Java";
        System.out.println(first == distinct);
        System.out.println(first == literal);
        System.out.println(first.equals(distinct));
    }
}
