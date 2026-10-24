/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 63
 */
public class BuilderEditsDemo {
    public static void main(String[] args) {
        StringBuilder text = new StringBuilder();
        text.append("Welcome to Java");
        System.out.println(text);
        text.insert(11, "C++ and ");
        System.out.println(text);
        text.deleteCharAt(1);
        System.out.println(text);
        text.insert(1, "e");
        System.out.println(text);
        text.replace(11, 14, "CPP");
        System.out.println(text);
        System.out.println(text.reverse());
    }
}
