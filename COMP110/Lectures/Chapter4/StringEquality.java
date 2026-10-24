/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 58
 */
public class StringEquality {
    public static void main(String[] args) {
        String first = "Java";
        String second = new String("Java");
        System.out.println(first == second);
        System.out.println(first.equals(second));
        System.out.println(first.equalsIgnoreCase("java"));
        System.out.println("yes".equals("YES"));
    }
}
