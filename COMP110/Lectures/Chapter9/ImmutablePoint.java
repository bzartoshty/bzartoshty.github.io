/**
 * COMP 110 - Chapter 9: Objects and Classes
 * Slides 45
 * Assumptions: The class is final and contains only private final primitive state.
 */
public final class ImmutablePoint {
    private final int x;
    private final int y;

    public ImmutablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }
}
