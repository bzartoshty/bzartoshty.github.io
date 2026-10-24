/**
 * COMP 110 - Chapter 5: Loops
 * Slides 34
 */
public class MultiTable {
    public static void main(String[] args) {
        for (int row = 1; row <= 9; row++) {
            for (int column = 1; column <= 9; column++) {
                System.out.printf("%4d", row * column);
            }
            System.out.println();
        }
    }
}
