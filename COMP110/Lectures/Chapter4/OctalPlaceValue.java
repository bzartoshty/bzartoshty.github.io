/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 17
 */
public class OctalPlaceValue {
    public static void main(String[] args) {
        int value = 2 * 512 + 0 * 64 + 7 * 8 + 0;
        System.out.println(value);
        System.out.println(Integer.parseInt("2070", 8));
        System.out.println(Integer.parseInt("10", 8));
    }
}
