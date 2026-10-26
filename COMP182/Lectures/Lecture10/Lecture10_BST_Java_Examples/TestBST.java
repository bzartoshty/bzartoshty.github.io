public class TestBST {
    public static BinarySearchTree<Integer> example() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        for (int k : new int[]{12,5,15,2,9,20,7,10,17,30}) tree.insert(k);
        return tree;
    }
    public static void main(String[] args) {
        Tree<Integer> tree = example();
        System.out.println("size: " + tree.size());
        System.out.println("contains 10: " + tree.contains(10));
        System.out.println("duplicate 12: " + tree.insert(12));
        for (int key : tree) System.out.print(key + " ");
        System.out.println();
    }
}
