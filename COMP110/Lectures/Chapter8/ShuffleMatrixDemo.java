import java.util.Random;
import java.util.Arrays;

/**
 * COMP 110 - Chapter 8: Multidimensional Arrays
 * Slides 27, 28
 * Assumptions: Rectangular non-null rows are distinct objects. Cell count fits in int. random is non-null.
 */
public class ShuffleMatrixDemo {
    static void shuffle(int[][] matrix, Random random) {
        if (matrix.length == 0) return;
        int columns = matrix[0].length;
        if (columns == 0) return;
        int cells = matrix.length * columns;
        for (int i = cells - 1; i > 0; i--) {
            swap(matrix, columns, i, random.nextInt(i + 1));
        }
    }

    static void swap(int[][] matrix, int columns, int i, int j) {
        int r1 = i / columns, c1 = i % columns;
        int r2 = j / columns, c2 = j % columns;
        int temp = matrix[r1][c1];
        matrix[r1][c1] = matrix[r2][c2];
        matrix[r2][c2] = temp;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        shuffle(matrix, new Random(8));
        System.out.println(Arrays.deepToString(matrix));
    }
}
