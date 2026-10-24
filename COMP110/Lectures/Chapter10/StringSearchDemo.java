/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 48
 */
public class StringSearchDemo {
    public static void main(String[] args) {
        String text = "Java Java";
        System.out.println(text.indexOf("Java"));
        System.out.println(text.lastIndexOf("Java"));
        System.out.println(text.indexOf("Python"));
        System.out.println(text.startsWith("Java"));
        System.out.println(text.contains(" "));
        System.out.println("ant".compareTo("bee") < 0);
    }
}
