/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 65
 */
public class BuilderLengthDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Java");
        builder.setLength(2);
        System.out.println(builder);
        builder.setLength(4);
        System.out.println(builder.length());
        System.out.println((int) builder.charAt(2));
        System.out.println(builder.substring(0, 2));
    }
}
