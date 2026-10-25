import java.util.Arrays;
public class MergeRunsDemo {
    public static void main(String[] args) {
        int[] left={2,4,5,9},right={1,6,7,8};
        System.out.println(Arrays.toString(MergeSort.mergeRuns(left,right)));
    }
}
