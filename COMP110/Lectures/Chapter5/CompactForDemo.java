/**
 * COMP 110 - Chapter 5: Loops
 * Slides 31
 * Assumptions: Deliberately compact legal forms for reading practice, not a recommended style.
 */
public class CompactForDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; System.out.println(i++));
        for (int i = 0, j = 0; i + j < 6; i++, j++) {
            System.out.println(i + ":" + j);
        }
    }
}
