/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 24
 */
public class ParseRadix {
    public static void main(String[] args) {
        System.out.println(Integer.parseInt("1111011", 2));
        System.out.println(Integer.parseInt("173", 8));
        System.out.println(Integer.parseInt("7B", 16));
        System.out.println(Integer.parseInt("10", 2));
        System.out.println(Integer.parseInt("10", 16));
    }
}
