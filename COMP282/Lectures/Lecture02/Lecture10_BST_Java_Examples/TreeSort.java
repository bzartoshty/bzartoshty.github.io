import java.util.*;
/** A counted-node tree retains duplicates; an ordinary BinarySearchTree set would lose them. */
public class TreeSort {
    private static class CountNode {
        int key, count = 1; CountNode left, right;
        CountNode(int key) { this.key = key; }
    }
    public static int[] sort(int[] input) {
        Objects.requireNonNull(input); CountNode root = null;
        for (int key : input) {
            if (root == null) { root = new CountNode(key); continue; }
            CountNode x = root;
            while (true) {
                if (key == x.key) { x.count++; break; }
                if (key < x.key) {
                    if (x.left == null) { x.left = new CountNode(key); break; }
                    x = x.left;
                } else {
                    if (x.right == null) { x.right = new CountNode(key); break; }
                    x = x.right;
                }
            }
        }
        int[] result = new int[input.length]; int at = 0;
        Deque<CountNode> stack = new ArrayDeque<>(); CountNode x = root;
        while (x != null || !stack.isEmpty()) {
            while (x != null) { stack.push(x); x = x.left; }
            x = stack.pop();
            for (int i = 0; i < x.count; i++) result[at++] = x.key;
            x = x.right;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{5,2,9,2,5,1})));
    }
}
