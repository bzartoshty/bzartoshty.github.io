/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 33
 */
public class CharNumericConversions {
    public static void main(String[] args) {
        int code = 'a';
        char letter = 97;
        char digit = '7';
        int value = digit - '0';
        System.out.println(code);
        System.out.println(letter);
        System.out.println((int) digit);
        System.out.println(value);
    }
}
