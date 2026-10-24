/**
 * COMP 110 - Chapter 8: Multidimensional Arrays
 * Slides 9
 */
public class RaggedArrayDemo {
    public static void main(String[] args) {
        int[][] rows = {
            {1, 2, 3, 4, 5},
            {2, 3, 4, 5},
            {3, 4, 5},
            {4, 5},
            {5}
        };
        for (int r = 0; r < rows.length; r++) {
            System.out.println(r + ": " + rows[r].length);
        }
    }
}
