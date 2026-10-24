/**
 * COMP 110 - Chapter 7: Arrays
 * Slides 44
 */
public class LinearSearchDemo {
    static int linearSearch(int[] values, int key) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == key) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] values = {6, 4, 1, 9, 7, 3, 2, 8};
        System.out.println(linearSearch(values, 3));
        System.out.println(linearSearch(values, 5));
    }
}
