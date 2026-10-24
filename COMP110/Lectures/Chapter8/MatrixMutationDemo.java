import java.util.Arrays;

/**
 * COMP 110 - Chapter 8: Multidimensional Arrays
 * Slides 30
 * Assumptions: The first row contains at least one element.
 */
public class MatrixMutationDemo {
    static void changeCell(int[][] matrix) {
        matrix[0][0] = 99;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}};
        changeCell(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
