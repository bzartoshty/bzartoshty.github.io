/**
 * COMP 110 - Chapter 8: Multidimensional Arrays
 * Slides 19
 * Assumptions: matrix and each row are non-null. The total fits in long.
 */
public class MatrixTotalDemo {
    static long total(int[][] matrix) {
        long sum = 0;
        for (int[] row : matrix) {
            for (int value : row) sum += value;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5}};
        System.out.println(total(matrix));
    }
}
