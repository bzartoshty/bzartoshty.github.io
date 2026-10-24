import java.util.Arrays;

/**
 * COMP 110 - Chapter 8: Multidimensional Arrays
 * Slides 34
 * Assumptions: matrix and every row are non-null.
 */
public class IndependentMatrixCopyDemo {
    static int[][] copyRows(int[][] matrix) {
        int[][] copy = new int[matrix.length][];
        for (int r = 0; r < matrix.length; r++) {
            copy[r] = matrix[r].clone();
        }
        return copy;
    }

    public static void main(String[] args) {
        int[][] original = {{1, 2}, {3}};
        int[][] copy = copyRows(original);
        copy[0][0] = 99;
        System.out.println(Arrays.deepToString(original));
        System.out.println(Arrays.deepToString(copy));
    }
}
