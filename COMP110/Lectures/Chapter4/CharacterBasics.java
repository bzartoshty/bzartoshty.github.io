/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 28
 */
public class CharacterBasics {
    public static void main(String[] args) {
        char letter = 'A';
        char digit = '4';
        char escaped = '\u0041';
        System.out.println(letter);
        System.out.println(digit);
        System.out.println(escaped);
        char next = 'a';
        System.out.println(++next);
    }
}
