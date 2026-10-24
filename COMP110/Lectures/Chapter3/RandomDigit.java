/**
 * COMP 110 - Chapter 3: Selections
 * Slides 26
 * Minimum Java version for this source: 8
 * Assumptions: Digit is from 0 through 9; output varies across runs.
 */
public class RandomDigit {
    public static void main(String[] args) {
        double sample = Math.random();
        int digit = (int) (sample * 10);
        System.out.println("Sample: " + sample);
        System.out.println("Digit: " + digit);
    }
}
