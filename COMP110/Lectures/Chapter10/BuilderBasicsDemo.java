/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 62
 */
public class BuilderBasicsDemo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        System.out.println(builder.length());
        System.out.println(builder.capacity());
        builder.append("Java").append('!');
        System.out.println(builder);
        System.out.println(builder.capacity() >= builder.length());
    }
}
