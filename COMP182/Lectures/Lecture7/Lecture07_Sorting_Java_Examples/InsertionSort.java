import java.util.*;
import java.util.function.Consumer;
/** Strict shifts preserve ties. A snapshot is emitted after each insertion. */
public class InsertionSort {
    public static void sort(int[] a) { sort(a, state -> {}); }
    public static void sort(int[] a, Consumer<int[]> trace) {
        Objects.requireNonNull(a); Objects.requireNonNull(trace);
        for (int i = 1; i < a.length; i++) {
            int value = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > value) {
                a[j + 1] = a[j]; j--;
            }
            a[j + 1] = value;
            trace.accept(a.clone());
        }
    }
    public static <T> void sort(T[] a, Comparator<? super T> cmp) {
        Objects.requireNonNull(a); Objects.requireNonNull(cmp);
        for (int i = 1; i < a.length; i++) {
            T value = a[i]; int j = i-1;
            while (j >= 0 && cmp.compare(a[j],value) > 0) {
                a[j+1] = a[j]; j--;
            }
            a[j+1] = value;
        }
    }
    public static void main(String[] args) {
        int[] a = {2,9,5,4,8,1,6};
        System.out.println("Initial: " + Arrays.toString(a));
        sort(a,state -> System.out.println("Inserted: " + Arrays.toString(state)));
    }
}
