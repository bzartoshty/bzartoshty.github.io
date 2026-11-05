import java.util.*;

/** Height counts occupied levels: an empty tree has height 0, a leaf height 1. */
public class HeightDemo {
    public static int minimumHeight(int nodes) {
        if (nodes < 0) throw new IllegalArgumentException("nodes must be nonnegative");
        // For integer n >= 0, bit length equals ceil(log2(n + 1)).
        return nodes == 0 ? 0 : Integer.SIZE - Integer.numberOfLeadingZeros(nodes);
    }

    public static long maximumNodes(int height) {
        if (height < 0 || height > 62)
            throw new IllegalArgumentException("height must be between 0 and 62");
        return (1L << height) - 1;
    }

    public static long maximumLeaves(int height) {
        if (height < 0 || height > 62)
            throw new IllegalArgumentException("height must be between 0 and 62");
        return height == 0 ? 0 : 1L << (height - 1);
    }

    public static void main(String[] args) {
        BinarySearchTree<Integer> empty = new BinarySearchTree<>();
        BinarySearchTree<Integer> leaf = new BinarySearchTree<>();
        leaf.insert(1);
        System.out.println("empty height: " + empty.height());
        System.out.println("leaf height: " + leaf.height());
        System.out.println("traversal example height: " + TraversalDemo.example().height());
        BinarySearchTree<Integer> chain = new BinarySearchTree<>();
        BinarySearchTree<Integer> balanced = new BinarySearchTree<>();
        for (int k = 1; k <= 7; k++) chain.insert(k);
        for (int k : new int[]{4, 2, 6, 1, 3, 5, 7}) balanced.insert(k);
        System.out.println("7-node chain height: " + chain.height());
        System.out.println("7-node perfect tree height: " + balanced.height());
        List<Integer> keys = new ArrayList<>();
        for (int i = 1; i <= 31; i++) keys.add(i);
        BinarySearchTree<Integer> sorted = new BinarySearchTree<>();
        BinarySearchTree<Integer> random = new BinarySearchTree<>();
        for (int k : keys) sorted.insert(k);
        Collections.shuffle(keys, new Random(182));
        for (int k : keys) random.insert(k);
        System.out.println("sorted height: " + sorted.height());
        System.out.println("shuffled height: " + random.height());
        System.out.println("31 nodes: " + minimumHeight(31) + " to 31 height");
        System.out.println("height 4: 4 levels, maximum nodes: " + maximumNodes(4));
        System.out.println("height 8: maximum nodes: " + maximumNodes(8));
        System.out.println("2011 nodes: " + minimumHeight(2011) + " to 2011 height");
        System.out.println("height 10: 1 to " + maximumLeaves(10) + " leaves");
    }
}
