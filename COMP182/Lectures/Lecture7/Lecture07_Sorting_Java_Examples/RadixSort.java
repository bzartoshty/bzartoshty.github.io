import java.util.*;
import java.util.function.Consumer;
/** Base-10 LSD with FIFO digit buckets; accepts nonnegative int keys. */
public class RadixSort {
    public static void sort(int[] a) { sort(a,state -> {}); }
    public static void sort(int[] a,Consumer<int[]> trace) {
        Objects.requireNonNull(a);Objects.requireNonNull(trace);int max=0;
        for (int key:a) {
            if (key<0) throw new IllegalArgumentException("nonnegative keys required");
            max=Math.max(max,key);
        }
        for (long place=1;max/place>0;place*=10) {
            List<List<Integer>> buckets=new ArrayList<>(10);
            for (int i=0;i<10;i++) buckets.add(new ArrayList<>());
            for (int key:a) buckets.get((int)(key/place%10)).add(key);
            int out=0;
            for (List<Integer> bucket:buckets) for (int key:bucket) a[out++]=key;
            trace.accept(a.clone());
        }
    }
    public static void sort(SortItem[] a) {
        Objects.requireNonNull(a);int max=0;
        for (SortItem item:a) {
            if (item==null || item.key()<0) throw new IllegalArgumentException("nonnegative keys required");
            max=Math.max(max,item.key());
        }
        for (long place=1;max/place>0;place*=10) {
            List<List<SortItem>> buckets=new ArrayList<>(10);
            for (int i=0;i<10;i++) buckets.add(new ArrayList<>());
            for (SortItem item:a) buckets.get((int)(item.key()/place%10)).add(item);
            int out=0;
            for (List<SortItem> bucket:buckets) for (SortItem item:bucket) a[out++]=item;
        }
    }
    public static void main(String[] args) {
        int[] a={331,454,230,34,343,45,59,453,345,231,9};
        System.out.println("Input: " + Arrays.toString(a));
        sort(a,state -> System.out.println("Digit pass: " + Arrays.toString(state)));
    }
}
