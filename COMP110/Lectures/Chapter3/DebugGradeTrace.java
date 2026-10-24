/**
 * COMP 110 - Chapter 3: Selections
 * Slides 70
 * Minimum Java version for this source: 8
 * Assumptions: Intentional threshold error: > is used where >= is required.
 */
public class DebugGradeTrace {
    public static void main(String[] args) {
        int score = 80;
        System.out.println("DEBUG score=" + score);
        System.out.println("DEBUG score>80=" + (score > 80));
        if (score > 80) {
            System.out.println("At least 80");
        } else {
            System.out.println("Below 80");
        }
    }
}
