/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 37
 */
public class UnicodeCharacterTest {
    public static void main(String[] args) {
        char digit = '\u0663';
        System.out.println(Character.isDigit(digit));
        System.out.println(digit >= '0' && digit <= '9');
        System.out.println(Character.digit(digit, 10));
        System.out.println(Character.digit('F', 16));
        System.out.println(Character.digit('G', 16));
    }
}
