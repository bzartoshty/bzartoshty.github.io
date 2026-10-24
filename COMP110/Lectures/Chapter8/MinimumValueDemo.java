/**
 * COMP 110 - Chapter 8: Multidimensional Arrays
 * Slides 25
 * Assumptions: Rows are non-null and at least one element exists.
 */
public class MinimumValueDemo {
    static int minimum(int[][] matrix) {
        int best = Integer.MAX_VALUE;
        for (int[] row : matrix) {
            for (int value : row) {
                if (value < best) best = value;
            }
        }
        return best;
    }

    public static void main(String[] args) {
        int[][] matrix = {{-2, 7}, {-8, 3}};
        System.out.println(minimum(matrix));
    }
}
