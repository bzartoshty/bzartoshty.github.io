public class SearchDemo {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = TestBST.example();
        for (int k : new int[]{10,8}) {
            System.out.print(k + " path:");
            for (Node<Integer> node : tree.path(k)) System.out.print(" " + node.key);
            System.out.println();
            System.out.println("iterative: " + tree.contains(k));
            System.out.println("recursive: " + tree.containsRecursive(tree.root, k));
        }
    }
}
