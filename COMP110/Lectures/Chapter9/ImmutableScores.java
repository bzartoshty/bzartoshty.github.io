/**
 * COMP 110 - Chapter 9: Objects and Classes
 * Slides 47
 * Assumptions: Input values is non-null. The class copies its private int array on input and output.
 */
public final class ImmutableScores {
    private final int[] values;

    public ImmutableScores(int[] values) {
        this.values = values.clone();
    }

    public int[] getValues() {
        return values.clone();
    }
}
