/**
 * COMP 110 - Chapter 8: Multidimensional Arrays
 * Slides 40
 * Assumptions: matrix and all rows are non-null. The count fits in long.
 */
public class CountAboveMatrixDemo {
    static long countAbove(int[][] matrix, int limit) {
        long count = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                if (value > limit) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] matrix = {{2, 8}, {}, {6}};
        System.out.println(countAbove(matrix, 5));
        System.out.println(countAbove(new int[0][], 5));
    }
}
