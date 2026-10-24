/**
 * COMP 110 - Chapter 8: Multidimensional Arrays
 * Slides 36
 */
public class RectangularShapeDemo {
    static boolean isRectangular(int[][] matrix) {
        if (matrix == null) return false;
        if (matrix.length == 0) return true;
        if (matrix[0] == null) return false;
        int columns = matrix[0].length;
        for (int[] row : matrix) {
            if (row == null || row.length != columns) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isRectangular(new int[][]{{1}, {2}}));
        System.out.println(isRectangular(new int[][]{{1}, {2, 3}}));
        System.out.println(isRectangular(new int[2][]));
        System.out.println(isRectangular(new int[0][]));
    }
}
