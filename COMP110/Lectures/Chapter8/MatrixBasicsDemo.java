/**
 * COMP 110 - Chapter 8: Multidimensional Arrays
 * Slides 6
 */
public class MatrixBasicsDemo {
    public static void main(String[] args) {
        int[][] matrix;
        matrix = new int[3][4];
        matrix[1][2] = 7;
        System.out.println(matrix.length);
        System.out.println(matrix[1].length);
        System.out.println(matrix[1][2]);
        System.out.println(matrix[0][0]);
    }
}
