/**
 * COMP 110 - Chapter 3: Selections
 * Slides 63
 * Minimum Java version for this source: 8
 */
public class ConditionalOperator {
    public static void main(String[] args) {
        int x = 0;
        int y = (x > 0) ? 1 : -1;
        System.out.println(y);
        int number = 8;
        String kind = (number % 2 == 0) ? "even" : "odd";
        System.out.println(number + " is " + kind);
    }
}
