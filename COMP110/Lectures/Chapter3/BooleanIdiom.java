/**
 * COMP 110 - Chapter 3: Selections
 * Slides 24
 * Minimum Java version for this source: 8
 */
public class BooleanIdiom {
    public static void main(String[] args) {
        int number = 8;
        boolean even = number % 2 == 0;
        if (even) {
            System.out.println("Even");
        }
        System.out.println(!even);
    }
}
