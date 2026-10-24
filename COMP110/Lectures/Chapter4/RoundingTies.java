/**
 * COMP 110 - Chapter 4: Math, Characters, and Strings
 * Slides 7
 */
public class RoundingTies {
    public static void main(String[] args) {
        System.out.println(Math.rint(2.5));
        System.out.println(Math.rint(3.5));
        System.out.println(Math.round(2.5));
        System.out.println(Math.round(-2.5));
        long whole = Math.round(3.2);
        System.out.println(whole);
    }
}
