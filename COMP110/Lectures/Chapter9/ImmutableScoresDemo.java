import java.util.Arrays;

/**
 * COMP 110 - Chapter 9: Objects and Classes
 * Slides 48
 */
public class ImmutableScoresDemo {
    public static void main(String[] args) {
        int[] input = {80, 90};
        ImmutableScores scores = new ImmutableScores(input);
        input[0] = 0;
        int[] returned = scores.getValues();
        returned[1] = 0;
        System.out.println(Arrays.toString(scores.getValues()));
    }
}
