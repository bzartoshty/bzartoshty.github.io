public class TraversalDemo {
    public static BinarySearchTree<Integer> example() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        for (int k : new int[]{30,20,70,10,50,90,40,60}) tree.insert(k);
        return tree;
    }
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = example();
        System.out.print("preorder: "); tree.preorder(); System.out.println();
        System.out.print("inorder: "); tree.inorder(); System.out.println();
        System.out.print("postorder: "); tree.postorder(); System.out.println();
        System.out.print("level order: "); tree.levelOrder(); System.out.println();
        tree.inorder(); tree.levelOrder(); System.out.println();
        // Root 30 has a right subtree; its successor is the minimum there.
        Node<Integer> successor = tree.root.right;
        while (successor.left != null) successor = successor.left;
        System.out.println("successor of 30: " + successor.key);
    }
}
