import java.util.*;
public class SelectionSort {
    public static void sort(int[] a) {
        Objects.requireNonNull(a);
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++)
                if (a[j] < a[min]) min = j;
            swap(a, i, min);
        }
    }
    private static void swap(int[] a, int i, int j) {
        int value = a[i]; a[i] = a[j]; a[j] = value;
    }
    public static <T> void sort(T[] a, Comparator<? super T> cmp) {
        Objects.requireNonNull(a); Objects.requireNonNull(cmp);
        for (int i = 0; i < a.length-1; i++) {
            int min = i;
            for (int j = i+1; j < a.length; j++)
                if (cmp.compare(a[j],a[min]) < 0) min = j;
            T value = a[i]; a[i] = a[min]; a[min] = value;
        }
    }
    public static void main(String[] args) {
        int[] a = {2,9,5,4,8,1}; sort(a); System.out.println(Arrays.toString(a));
    }
}
