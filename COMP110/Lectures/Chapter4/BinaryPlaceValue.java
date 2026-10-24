/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 16
 */
public class BinaryPlaceValue {
    public static void main(String[] args) {
        int value = 1 * 128 + 0 * 64 + 1 * 32 + 0 * 16
            + 1 * 8 + 0 * 4 + 1 * 2 + 1;
        System.out.println(value);
        System.out.println(Integer.parseInt("10101011", 2));
    }
}
