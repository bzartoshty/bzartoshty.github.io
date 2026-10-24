/**
 * COMP 110 - Chapter 9: Objects and Classes
 * Slides 59
 */
public class RationalDriver {
    public static void main(String[] args) {
        Rational first = new Rational(1, 2);
        Rational second = new Rational(1, 3);
        System.out.println(first.add(second));
        System.out.println(first.subtract(second));
        System.out.println(first.multiply(second));
        System.out.println(first.divide(second));
        System.out.println(first);
        System.out.println(first.equals(new Rational(2, 4)));
    }
}
