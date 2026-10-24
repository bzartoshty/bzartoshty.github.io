/**
 * COMP 110 - Chapter 3: Selections
 * Slides 27
 * Minimum Java version for this source: 8
 */
public class RandomRangeCast {
    public static void main(String[] args) {
        double sample = 0.73;
        int correct = (int) (sample * 10);
        int wrong = (int) sample * 10;
        int die = 1 + (int) (sample * 6);
        System.out.println(correct);
        System.out.println(wrong);
        System.out.println(die);
    }
}
