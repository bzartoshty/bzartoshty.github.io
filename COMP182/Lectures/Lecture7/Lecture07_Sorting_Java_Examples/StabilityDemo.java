import java.util.*;
public class StabilityDemo {
    public static void main(String[] args) {
        SortItem[] source={new SortItem(2,"A"),new SortItem(2,"B"),new SortItem(1,"C")};
        Comparator<SortItem> byKey=Comparator.comparingInt(SortItem::key);
        SortItem[] a=source.clone();BubbleSort.sort(a,byKey);show("Bubble",a);
        a=source.clone();InsertionSort.sort(a,byKey);show("Insertion",a);
        a=source.clone();MergeSort.sort(a,byKey);show("Merge",a);
        a=source.clone();BucketSort.sort(a,3);show("FIFO bucket",a);
        a=source.clone();RadixSort.sort(a);show("LSD radix",a);
        a=source.clone();SelectionSort.sort(a,byKey);show("Swap selection",a);
    }
    private static void show(String algorithm,SortItem[] a) {
        System.out.println(algorithm+": "+Arrays.toString(a));
    }
}
