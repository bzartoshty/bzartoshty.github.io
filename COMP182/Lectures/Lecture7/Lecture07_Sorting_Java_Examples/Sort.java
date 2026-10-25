import java.util.*;
import java.util.function.Consumer;
/** Run each of the nine implemented sorts on the same nonnegative input. */
public class Sort {
    private static final int[] INPUT={2,9,5,4,8,1,6,5};
    private static void demonstrate(String name,Consumer<int[]> algorithm) {
        int[] a=INPUT.clone();algorithm.accept(a);
        System.out.println(name+": "+Arrays.toString(a));
    }
    public static void main(String[] args) {
        demonstrate("Bubble",BubbleSort::sort);
        demonstrate("Selection",SelectionSort::sort);
        demonstrate("Insertion",InsertionSort::sort);
        demonstrate("Merge",MergeSort::sort);
        demonstrate("Quick",QuickSort::sort);
        demonstrate("Direct bucket",a -> BucketSort.sort(a,10));
        demonstrate("LSD radix",RadixSort::sort);
        demonstrate("Heap",HeapSort::sort);
        demonstrate("Counted BST",a -> {
            int[] sorted=TreeSort.sort(a);System.arraycopy(sorted,0,a,0,a.length);
        });
    }
}
