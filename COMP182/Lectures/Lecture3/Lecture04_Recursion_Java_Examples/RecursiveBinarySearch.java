/**
 * COMP 182 - Lecture 4 Recursion
 * Source method: slide 15 of the supplied lecture.
 * Non-null ascending sorted int array. Return any matching index or -1. Default target is 24.
 */
public class RecursiveBinarySearch {
    static int binarySearch(int[] a, int target,
                            int low, int high) {
        if (low > high) return -1;
        int mid = low + (high - low) / 2;
        if (a[mid] == target) return mid;
        if (target < a[mid])
            return binarySearch(a, target, low, mid - 1);
        return binarySearch(a, target, mid + 1, high);
    }

    public static void main(String[] args) {
        int[] a = {3, 8, 12, 17, 24, 31, 40};
        int target = args.length == 0 ? 24 : Integer.parseInt(args[0]);
        System.out.println(binarySearch(a, target, 0, a.length - 1));
    }
}
