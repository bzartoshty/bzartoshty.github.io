/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 59
 */
public class StringOrdering {
    public static void main(String[] args) {
        System.out.println("Ada".compareTo("Bob") < 0);
        System.out.println("Java".compareTo("Java"));
        System.out.println("Bob".compareTo("Ada") > 0);
        System.out.println("JAVA".compareToIgnoreCase("java"));
    }
}
