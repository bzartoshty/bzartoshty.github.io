/**
 * COMP 110 - Chapter 8: Multidimensional Arrays
 * Slides 10
 */
public class AllocateRowsDemo {
    public static void main(String[] args) {
        int[][] rows = new int[3][];
        System.out.println(rows[0] == null);
        rows[0] = new int[]{10, 20};
        rows[1] = new int[0];
        rows[2] = new int[]{30};
        System.out.println(rows[0].length);
        System.out.println(rows[1].length);
        System.out.println(rows[2][0]);
    }
}
