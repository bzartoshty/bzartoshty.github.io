/**
 * COMP 110 - Chapter 3: Selections
 * Slides 16
 * Minimum Java version for this source: 8
 * Assumptions: Intentional logic error: overlapping categories are ordered incorrectly.
 */
public class GradeOrderPitfall {
    public static void main(String[] args) {
        int score = 95;
        if (score >= 60) {
            System.out.println("D");
        } else if (score >= 90) {
            System.out.println("A");
        }
    }
}
