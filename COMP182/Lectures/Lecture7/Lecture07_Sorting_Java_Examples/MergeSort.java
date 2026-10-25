import java.util.*;
import java.util.function.Consumer;
/** Half-open ranges [lo,hi), one shared temporary buffer, left-first ties. */
public class MergeSort {
    public static void sort(int[] a) { sort(a, state -> {}); }
    public static void sort(int[] a, Consumer<int[]> trace) {
        Objects.requireNonNull(a); Objects.requireNonNull(trace);
        mergeSort(a,new int[a.length],0,a.length,trace);
    }
    private static void mergeSort(int[] a,int[] temp,int lo,int hi,Consumer<int[]> trace) {
        if (hi-lo <= 1) return;
        int mid = lo+(hi-lo)/2;
        mergeSort(a,temp,lo,mid,trace);
        mergeSort(a,temp,mid,hi,trace);
        merge(a,temp,lo,mid,hi);
        trace.accept(Arrays.copyOfRange(a,lo,hi));
    }
    private static void merge(int[] a,int[] temp,int lo,int mid,int hi) {
        int left = lo,right = mid,out = lo;
        while (left < mid && right < hi)
            temp[out++] = a[left] <= a[right] ? a[left++] : a[right++];
        while (left < mid) temp[out++] = a[left++];
        while (right < hi) temp[out++] = a[right++];
        System.arraycopy(temp,lo,a,lo,hi-lo);
    }
    /** Reproduce slide 9's left-heavy odd splits, separately from slide 10's midpoint. */
    public static void sortLikeFigure(int[] a,Consumer<int[]> trace) {
        Objects.requireNonNull(a);Objects.requireNonNull(trace);
        mergeFigure(a,new int[a.length],0,a.length,trace);
    }
    private static void mergeFigure(int[] a,int[] temp,int lo,int hi,Consumer<int[]> trace) {
        if (hi-lo <= 1) return;
        int mid=lo+(hi-lo+1)/2;
        mergeFigure(a,temp,lo,mid,trace);mergeFigure(a,temp,mid,hi,trace);
        merge(a,temp,lo,mid,hi);trace.accept(Arrays.copyOfRange(a,lo,hi));
    }
    /** Both inputs must be sorted ascending; inputs remain unchanged. */
    public static int[] mergeRuns(int[] left,int[] right) {
        Objects.requireNonNull(left); Objects.requireNonNull(right);
        requireSorted(left); requireSorted(right);
        int[] result = new int[Math.addExact(left.length,right.length)];
        System.arraycopy(left,0,result,0,left.length);
        System.arraycopy(right,0,result,left.length,right.length);
        merge(result,new int[result.length],0,left.length,result.length);
        return result;
    }
    private static void requireSorted(int[] a) {
        for (int i=1;i<a.length;i++) if (a[i-1] > a[i])
            throw new IllegalArgumentException("run must be sorted");
    }
    public static <T> void sort(T[] a,Comparator<? super T> cmp) {
        Objects.requireNonNull(a); Objects.requireNonNull(cmp);
        mergeSort(a,a.clone(),0,a.length,cmp);
    }
    private static <T> void mergeSort(T[] a,T[] temp,int lo,int hi,Comparator<? super T> cmp) {
        if (hi-lo <= 1) return;
        int mid=lo+(hi-lo)/2;
        mergeSort(a,temp,lo,mid,cmp); mergeSort(a,temp,mid,hi,cmp);
        int left=lo,right=mid,out=lo;
        while (left < mid && right < hi)
            temp[out++] = cmp.compare(a[left],a[right]) <= 0 ? a[left++] : a[right++];
        while (left < mid) temp[out++] = a[left++];
        while (right < hi) temp[out++] = a[right++];
        System.arraycopy(temp,lo,a,lo,hi-lo);
    }
    public static void main(String[] args) {
        int[] a={38,16,27,39,12,27};
        int[] figure=a.clone();
        System.out.println("Input: " + Arrays.toString(a));
        sort(a,run -> System.out.println("Pseudocode merged run: " + Arrays.toString(run)));
        sortLikeFigure(figure,run -> System.out.println("Figure merged run: " + Arrays.toString(run)));
    }
}
