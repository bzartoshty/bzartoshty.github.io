import java.util.*;
/** Bottom-up max heap, then repeated root/end exchange. O(1) extra storage. */
public class HeapSort {
    public static void sort(int[] a) {
        Objects.requireNonNull(a);
        for (int root=a.length/2-1;root>=0;root--) siftDown(a,root,a.length);
        for (int end=a.length-1;end>0;end--) {
            int value=a[0];a[0]=a[end];a[end]=value;siftDown(a,0,end);
        }
    }
    private static void siftDown(int[] a,int root,int n) {
        while (root<n/2) {
            int child=2*root+1;
            if (child+1<n && a[child]<a[child+1]) child++;
            if (a[root]>=a[child]) return;
            int value=a[root];a[root]=a[child];a[child]=value;root=child;
        }
    }
    public static void main(String[] args) {
        int[] a={2,9,5,4,8,1};sort(a);System.out.println(Arrays.toString(a));
    }
}
