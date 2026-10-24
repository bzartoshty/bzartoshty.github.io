/**
 * COMP 110 - Chapter 5: Loops
 * Slides 30
 * Assumptions: Intentional logic mistake: an extra semicolon makes the following block independent.
 */
public class ForSemicolonPitfall {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 3; i++); // empty loop body
        {
            System.out.println("Printed once: " + i);
        }
    }
}
