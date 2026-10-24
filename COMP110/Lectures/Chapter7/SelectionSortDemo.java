import java.util.Arrays;

/**
 * COMP 110 - Chapter 7: Arrays
 * Slides 51, 52
 */
public class SelectionSortDemo {
    static void selectionSort(int[] values) {
        for (int i = 0; i < values.length - 1; i++) {
            int smallest = indexOfSmallest(values, i);
            int temp = values[i];
            values[i] = values[smallest];
            values[smallest] = temp;
        }
    }

    static int indexOfSmallest(int[] values, int start) {
        int smallest = start;
        for (int j = start + 1; j < values.length; j++) {
            if (values[j] < values[smallest]) smallest = j;
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] values = {4, 2, 3, 1};
        selectionSort(values);
        System.out.println(Arrays.toString(values));
    }
}
