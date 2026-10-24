/**
 * COMP 110 - Chapter 10: Thinking in Objects
 * Slides 40
 */
public class WrapperParsingDemo {
    public static void main(String[] args) {
        System.out.println(Integer.parseInt("101", 2));
        System.out.println(Integer.parseInt("FF", 16));
        System.out.println(Double.parseDouble("12.5"));
        try {
            Integer.parseInt("12x");
        } catch (NumberFormatException ex) {
            System.out.println("Not an integer");
        }
    }
}
