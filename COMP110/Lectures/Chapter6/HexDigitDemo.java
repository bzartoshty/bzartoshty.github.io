/**
 * COMP 110 - Chapter 6: Methods
 * Slides 27-28: Convert one uppercase hexadecimal digit.
 * Run: java HexDigitDemo
 * Assumptions: ch is a digit from 0-9 or A-F.
 */
public class HexDigitDemo {
    static int hexDigitToDecimal(char ch) {
        if (ch >= '0' && ch <= '9') {
            return ch - '0';
        }
        return ch - 'A' + 10;
    }

    public static void main(String[] args) {
        System.out.println(hexDigitToDecimal('7'));
        System.out.println(hexDigitToDecimal('C'));
        System.out.println(hexDigitToDecimal('F'));
    }
}
