public class TraversalDemo {
    public static BST<Integer> example() {
        BST<Integer> tree = new BST<>();
        for (int k : new int[]{30,20,70,10,50,90,40,60}) tree.insert(k);
        return tree;
    }
    public static void main(String[] args) {
        BST<Integer> tree = example();
        System.out.println("preorder: " + tree.preorderKeys());
        System.out.println("inorder: " + tree.inorderKeys());
        System.out.println("postorder: " + tree.postorderKeys());
        System.out.println("level order: " + tree.levelOrderKeys());
        tree.inorder(); tree.levelOrder(); System.out.println();
        System.out.println("successor of 30: " + tree.successor(30).orElseThrow());
    }
}
