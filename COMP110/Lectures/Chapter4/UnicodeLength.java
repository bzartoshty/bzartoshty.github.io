/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 30
 */
public class UnicodeLength {
    public static void main(String[] args) {
        String symbol = "\uD83D\uDE00";
        System.out.println(symbol.length());
        System.out.println(symbol.codePointCount(0, symbol.length()));
        System.out.println(Character.isSurrogate(symbol.charAt(0)));
    }
}
