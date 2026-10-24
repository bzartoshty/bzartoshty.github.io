/**
 * COMP 110 - Chapter 5: Loops
 * Slides 45
 */
public class NestedBreak {
    public static void main(String[] args) {
        for (int row = 1; row <= 2; row++) {
            for (int column = 1; column <= 3; column++) {
                if (column == 2) break;
                System.out.println(row + ":" + column);
            }
        }
        System.out.println("Finished");
    }
}
