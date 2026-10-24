/**
 * COMP 110 - Chapter 3: Selections
 * Slides 66
 * Minimum Java version for this source: 8
 */
public class ConditionPrecedence {
    public static void main(String[] args) {
        int x = 10, y = 3;
        System.out.println(3 + 5 * (4 - 3) > 34);
        System.out.println(x > 5 || y < 0 && x < 0);
        System.out.println((x > 5 || y < 0) && x < 0);
        System.out.println(!false && false || true);
    }
}
