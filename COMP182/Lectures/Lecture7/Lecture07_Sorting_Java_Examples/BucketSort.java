import java.util.*;
/** Direct-address FIFO buckets for keys 0..keyRange-1; not interval bucket sort. */
public class BucketSort {
    private static void range(int keyRange) {
        if (keyRange < 1 || keyRange > 1_000_000)
            throw new IllegalArgumentException("demo keyRange must be 1..1000000");
    }
    public static void sort(int[] a,int keyRange) {
        Objects.requireNonNull(a); range(keyRange);
        for (int key:a) if (key < 0 || key >= keyRange)
            throw new IllegalArgumentException("key outside bucket range");
        List<List<Integer>> buckets=new ArrayList<>(keyRange);
        for (int i=0;i<keyRange;i++) buckets.add(new ArrayList<>());
        for (int key:a) buckets.get(key).add(key);
        int out=0;
        for (List<Integer> bucket:buckets) for (int key:bucket) a[out++]=key;
    }
    public static void sort(SortItem[] a,int keyRange) {
        Objects.requireNonNull(a);range(keyRange);
        for (SortItem item:a) if (item==null || item.key()<0 || item.key()>=keyRange)
            throw new IllegalArgumentException("record outside bucket range");
        List<List<SortItem>> buckets=new ArrayList<>(keyRange);
        for (int i=0;i<keyRange;i++) buckets.add(new ArrayList<>());
        for (SortItem item:a) buckets.get(item.key()).add(item);
        int out=0;
        for (List<SortItem> bucket:buckets) for (SortItem item:bucket) a[out++]=item;
    }
    public static void main(String[] args) {
        int[] a={2,0,3,2,1,0};sort(a,4);System.out.println(Arrays.toString(a));
        SortItem[] records={new SortItem(2,"A"),new SortItem(1,"B"),new SortItem(2,"C")};
        sort(records,3);System.out.println(Arrays.toString(records));
    }
}
