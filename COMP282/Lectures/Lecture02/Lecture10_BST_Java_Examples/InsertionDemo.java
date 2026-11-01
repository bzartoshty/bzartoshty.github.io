public class InsertionDemo {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = TestBST.example();
        for (int k : new int[]{13,8,31,13}) {
            System.out.println("insert " + k + ": " + tree.insert(k));
            tree.inorder(); System.out.println();
        }
    }
}
