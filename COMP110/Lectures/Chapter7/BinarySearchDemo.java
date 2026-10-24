/**
 * COMP 110 - Chapter 7: Arrays
 * Slides 47
 * Assumptions: values is non-null and sorted in ascending order.
 */
public class BinarySearchDemo {
    static int binarySearch(int[] values, int key) {
        int low = 0, high = values.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (values[mid] == key) return mid;
            if (values[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] values = {2, 4, 7, 10, 11, 45, 50};
        System.out.println(binarySearch(values, 11));
        System.out.println(binarySearch(values, 8));
    }
}
