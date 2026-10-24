/**
 * COMP 110 - Chapter 7: Arrays
 * Slides 35
 */
public class ArrayParameterDemo {
    static void change(int number, int[] values) {
        number = 1001;
        values[0] = 5555;
    }

    public static void main(String[] args) {
        int number = 1;
        int[] values = {1};
        change(number, values);
        System.out.println(number);
        System.out.println(values[0]);
    }
}
