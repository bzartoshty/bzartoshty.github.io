public class TestRBTree {
    public static void main(String[] args) {
        // Create an RB tree
    RBTree<Integer> tree = new RBTree<>(new Integer[]{34, 3, 50});
    printTree(tree);

    tree.insert(20);
    printTree(tree);

    tree.insert(15);
    printTree(tree);

    tree.insert(16);
    printTree(tree);

    tree.insert(25);
    printTree(tree);

    tree.insert(27);
    printTree(tree);

    tree.delete(50);
    printTree(tree);

    tree.delete(20);
    printTree(tree);

    tree.delete(15);
    printTree(tree);

    tree.delete(3);
    printTree(tree);

    tree.delete(25);
    printTree(tree);

    tree.delete(16);
    printTree(tree);

    tree.delete(34);
    printTree(tree);

    tree.delete(27);
    printTree(tree);

   //     RBTree<Integer> tree = new RBTree<>();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        tree.insert(8);
        tree.insert(9);
        printTree(tree);
        tree.insert(10);
        tree.insert(11);
        printTree(tree);
    }

    public static <E extends Comparable<E>>
    void printTree(BinarySearchTree<E> tree) {
        // Traverse tree
        System.out.print("\nInorder (sorted): ");
        tree.inorder();
        System.out.print("\nPostorder: ");
        tree.postorder();
        System.out.print("\nPreorder: ");
        tree.preorder();
        System.out.print("\nThe number of nodes is " + tree.getSize());
        System.out.println();
    }
}
