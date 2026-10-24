/**
 * COMP 110 - Chapter 5: Loops
 * Slides 33
 */
public class NestedLoops {
    public static void main(String[] args) {
        for (int row = 1; row <= 2; row++) {
            for (int column = 1; column <= 3; column++) {
                System.out.print(row + ":" + column + " ");
            }
            System.out.println();
        }
    }
}
