/**
 * COMP 110 - Chapter 2: Elementary Programming
 * Slides 39
 */
public class NumericPromotion {
    public static void main(String[] args) {
        byte i = 100;
        long k = i * 3 + 4;
        double d = i * 3.1 + k / 2;
        System.out.println(k);
        System.out.println(d);
        System.out.println(k / 3);
        System.out.println(k / 3.0);
    }
}
