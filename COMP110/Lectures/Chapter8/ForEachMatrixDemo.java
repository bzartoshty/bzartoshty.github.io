/**
 * COMP 110 - Chapter 8: Multidimensional Arrays
 * Slides 13
 */
public class ForEachMatrixDemo {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3}};
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.println(value);
            }
        }
    }
}
