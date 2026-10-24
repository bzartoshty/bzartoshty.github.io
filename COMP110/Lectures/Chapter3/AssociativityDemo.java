/**
 * COMP 110 - Chapter 3: Selections
 * Slides 67
 * Minimum Java version for this source: 8
 */
public class AssociativityDemo {
    public static void main(String[] args) {
        System.out.println(20 - 5 - 3);
        System.out.println(20 - (5 - 3));
        int a, b;
        a = b = 7;
        System.out.println(a + " " + b);
        boolean result = true ? false : true ? true : false;
        System.out.println(result);
    }
}
