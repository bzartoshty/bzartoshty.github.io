/**
 * COMP 110 - Chapter 3: Selections
 * Slides 23
 * Minimum Java version for this source: 8
 * Assumptions: Intentional mistake: boolean assignment used in a condition.
 */
public class BooleanAssignmentPitfall {
    public static void main(String[] args) {
        boolean even = false;
        if (even = true) {
            System.out.println("Branch taken");
        }
        System.out.println(even);
    }
}
