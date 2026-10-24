/**
 * COMP 110 - Chapter 5: Loops
 * Slides 35
 */
public class TrianglePattern {
    public static void main(String[] args) {
        for (int row = 1; row <= 4; row++) {
            for (int star = 1; star <= row; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
