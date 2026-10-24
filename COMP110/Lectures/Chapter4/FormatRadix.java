/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 25
 * Assumptions: Nonnegative value in this representation exercise.
 */
public class FormatRadix {
    public static void main(String[] args) {
        int value = 123;
        System.out.println(Integer.toBinaryString(value));
        System.out.println(Integer.toOctalString(value));
        System.out.println(Integer.toHexString(value));
        System.out.println(Integer.toString(value, 16));
    }
}
