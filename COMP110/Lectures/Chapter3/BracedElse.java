/**
 * COMP 110 - Chapter 3: Selections
 * Slides 21
 * Minimum Java version for this source: 8
 */
public class BracedElse {
    public static void main(String[] args) {
        int i = 1, j = 2, k = 3;
        if (i > j) {
            if (i > k) {
                System.out.println("A");
            }
        } else {
            System.out.println("B");
        }
    }
}
