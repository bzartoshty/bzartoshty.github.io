import java.util.*;
import java.util.function.Consumer;
/** First-pivot two-cursor partition exactly as on slides 15-17. Unstable. */
public class QuickSort {
    public static void sort(int[] a) {
        Objects.requireNonNull(a); quickSort(a,0,a.length-1);
    }
    private static void quickSort(int[] a,int first,int last) {
        if (first >= last) return;
        int p=partition(a,first,last);
        quickSort(a,first,p-1); quickSort(a,p+1,last);
    }
    public static int partition(int[] a,int first,int last) {
        return partition(a,first,last,state -> {});
    }
    /** Inclusive nonempty range; snapshots are emitted after each swap. */
    public static int partition(int[] a,int first,int last,Consumer<int[]> trace) {
        Objects.requireNonNull(a); Objects.requireNonNull(trace);
        if (first < 0 || last >= a.length || first > last)
            throw new IndexOutOfBoundsException("nonempty inclusive range required");
        int pivot=a[first],low=first+1,high=last;
        while (low <= high) {
            while (low <= high && a[low] <= pivot) low++;
            while (low <= high && a[high] > pivot) high--;
            if (low < high) { swap(a,low,high); trace.accept(a.clone()); }
        }
        swap(a,first,high); trace.accept(a.clone()); return high;
    }
    private static void swap(int[] a,int i,int j) {
        int value=a[i];a[i]=a[j];a[j]=value;
    }
    /** Randomizes the initial order; duplicate-heavy inputs can still split poorly. */
    public static void randomizedSort(int[] a,long seed) {
        Objects.requireNonNull(a); Random random=new Random(seed);
        for (int i=a.length-1;i>0;i--) swap(a,i,random.nextInt(i+1));
        sort(a);
    }
    public static void main(String[] args) {
        int[] original={5,2,9,3,8,4,0,1,6,7},trace=original.clone();
        int p=partition(trace,0,trace.length-1,
            state -> System.out.println("Swap: " + Arrays.toString(state)));
        System.out.println("Final pivot index: " + p);
        sort(original);System.out.println("Sorted: " + Arrays.toString(original));
    }
}
