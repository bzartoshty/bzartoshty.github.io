/**
 * COMP 110 - Chapter 6: Methods
 * Slides 27, 29: Convert an uppercase hexadecimal string.
 * Run: java HexToDecimalDemo
 * Assumptions: hex is non-null, nonempty, uppercase hexadecimal with no sign or prefix. The result fits in int.
 */
public class HexToDecimalDemo {
    static int hexDigitToDecimal(char ch) {
        if (ch >= '0' && ch <= '9') {
            return ch - '0';
        }
        return ch - 'A' + 10;
    }

    static int hexToDecimal(String hex) {
        int value = 0;
        for (int i = 0; i < hex.length(); i++) {
            int digit = hexDigitToDecimal(hex.charAt(i));
            value = value * 16 + digit;
        }
        return value;
    }

    public static void main(String[] args) {
        System.out.println(hexToDecimal("2AF"));
        System.out.println(hexToDecimal("1B"));
        System.out.println(hexToDecimal("0"));
    }
}
