/**
 * COMP 110 - Chapter 7: Arrays
 * Slides 25
 */
public class PartialArrayDemo {
    public static void main(String[] args) {
        int[] values = new int[5];
        int size = 0;
        values[size++] = 10;
        values[size++] = 20;
        for (int i = 0; i < size; i++) {
            System.out.println(values[i]);
        }
        System.out.println("size=" + size);
        System.out.println("capacity=" + values.length);
    }
}
