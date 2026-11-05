import java.util.*;

/** Checks empty height 0 and leaf height 1 against an independent queue traversal. */
public class HeightConventionTest {
    private static void check(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
    }
    private static int levels(BinarySearchTree<Integer> tree) {
        Queue<Node<Integer>> queue = new ArrayDeque<>();
        if (tree.root != null) queue.add(tree.root);
        int h = 0;
        while (!queue.isEmpty()) {
            int width = queue.size();
            for (int i = 0; i < width; i++) {
                Node<Integer> node = queue.remove();
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            h++;
        }
        return h;
    }
    private static void verify(BinarySearchTree<Integer> tree) {
        int h = tree.height(), n = tree.size();
        check(h == levels(tree), "height disagrees with occupied levels");
        check(HeightDemo.minimumHeight(n) <= h && h <= n, "height bounds");
        if (h <= 62) check(n <= HeightDemo.maximumNodes(h), "node capacity");
    }
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        check(tree.height() == 0, "empty height"); verify(tree);
        tree.insert(4);
        check(tree.height() == 1, "leaf height"); verify(tree);
        for (int k : new int[]{2,6,1,3,5,7}) tree.insert(k);
        check(tree.height() == 3, "perfect height"); verify(tree);
        check(TraversalDemo.example().height() == 4, "slide 8 height");
        for (int k : new int[]{4,1,7,2,6,3,5}) {
            check(tree.delete(k), "delete existing key"); verify(tree);
        }
        check(tree.height() == 0, "height after deleting all keys");
        for (int k = 1; k <= 31; k++) {
            tree.insert(k); check(tree.height() == k, "chain height"); verify(tree);
        }
        check(!tree.insert(31) && tree.height() == 31, "duplicate height");
        tree.clear(); check(tree.height() == 0, "clear height");
        Random random = new Random(182);
        for (int i = 0; i < 500; i++) {
            int key = random.nextInt(150);
            if (random.nextBoolean()) tree.insert(key); else tree.delete(key);
            verify(tree);
        }
        check(HeightDemo.minimumHeight(0) == 0, "zero-node bound");
        check(HeightDemo.minimumHeight(31) == 5, "31-node minimum");
        check(HeightDemo.minimumHeight(2011) == 11, "2011-node minimum");
        check(HeightDemo.maximumNodes(0) == 0, "empty capacity");
        check(HeightDemo.maximumNodes(1) == 1, "leaf capacity");
        check(HeightDemo.maximumNodes(4) == 15, "height 4 capacity");
        check(HeightDemo.maximumNodes(8) == 255, "height 8 capacity");
        check(HeightDemo.maximumLeaves(0) == 0, "empty leaves");
        check(HeightDemo.maximumLeaves(1) == 1, "single leaf");
        check(HeightDemo.maximumLeaves(10) == 512, "height 10 leaves");
        for (int n = 1; n <= 4096; n++) {
            int h = HeightDemo.minimumHeight(n);
            check(HeightDemo.maximumNodes(h) >= n, "minimum sufficient");
            check(HeightDemo.maximumNodes(h-1) < n, "smaller height insufficient");
        }
        System.out.println("Height convention checks passed (empty 0, leaf 1).");
    }
}
