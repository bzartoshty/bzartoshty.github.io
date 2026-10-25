import java.util.*;
import java.util.function.Consumer;
/** Adjacent strict swaps; early exit. Trace receives independent pass snapshots. */
public class BubbleSort {
    public static void sort(int[] a) { sort(a, state -> {}); }
    public static void sort(int[] a, Consumer<int[]> trace) {
        Objects.requireNonNull(a); Objects.requireNonNull(trace);
        for (int end = a.length - 1; end > 0; end--) {
            boolean swapped = false;
            for (int j = 0; j < end; j++) {
                if (a[j] > a[j+1]) {
                    int value = a[j]; a[j] = a[j+1]; a[j+1] = value;
                    swapped = true;
                }
            }
            trace.accept(a.clone());
            if (!swapped) break;
        }
    }
    public static <T> void sort(T[] a, Comparator<? super T> cmp) {
        Objects.requireNonNull(a); Objects.requireNonNull(cmp);
        for (int end = a.length-1; end > 0; end--) {
            boolean swapped = false;
            for (int j = 0; j < end; j++) if (cmp.compare(a[j],a[j+1]) > 0) {
                T value = a[j]; a[j] = a[j+1]; a[j+1] = value; swapped = true;
            }
            if (!swapped) break;
        }
    }
    public static void main(String[] args) {
        int[] a = {2,9,5,4,8,1};
        System.out.println("Input: " + Arrays.toString(a));
        sort(a, state -> System.out.println("Pass: " + Arrays.toString(state)));
    }
}
