/**
 * COMP 110 - Chapter 6: Methods
 * Slides 14-15: Separate grade calculation from printing.
 * Run: java LetterGradeDemo
 * Assumptions: score is an integer from 0 through 100.
 */
public class LetterGradeDemo {
    public static char letterGrade(int score) {
        if (score >= 90) return 'A';
        if (score >= 80) return 'B';
        if (score >= 70) return 'C';
        if (score >= 60) return 'D';
        return 'F';
    }

    public static void main(String[] args) {
        int[] scores = {59, 60, 69, 70, 79, 80, 85, 89, 90, 100};
        for (int score : scores) {
            char grade = letterGrade(score);
            System.out.println(score + ": " + grade);
        }
    }
}
