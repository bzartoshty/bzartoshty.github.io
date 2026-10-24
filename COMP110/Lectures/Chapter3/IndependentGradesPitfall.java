/**
 * COMP 110 - Chapter 3: Selections
 * Slides 17
 * Minimum Java version for this source: 8
 * Assumptions: Intentional logic error when the intended result is exactly one grade.
 */
public class IndependentGradesPitfall {
    public static void main(String[] args) {
        int score = 95;
        if (score >= 90) System.out.println("A");
        if (score >= 80) System.out.println("B");
        if (score >= 70) System.out.println("C");
        if (score >= 60) System.out.println("D");
    }
}
