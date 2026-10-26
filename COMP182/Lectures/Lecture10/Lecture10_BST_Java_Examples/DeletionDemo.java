public class DeletionDemo {
    public static void main(String[] args) {
        BinarySearchTree<Integer> one = new BinarySearchTree<>();
        for (int k : new int[]{12,5,15,2,9,20,7,10,30}) one.insert(k);
        one.delete(15); System.out.print("one child: "); one.levelOrder(); System.out.println();
        BinarySearchTree<Integer> two = TestBST.example();
        two.delete(12); System.out.print("two children: "); two.levelOrder(); System.out.println();
        two.delete(7); System.out.print("leaf: "); two.inorder(); System.out.println();
        System.out.println("absent: " + two.delete(999));
        System.out.println("size: " + two.size());
        BinarySearchTree<Integer> single = new BinarySearchTree<>(); single.insert(1); single.delete(1);
        System.out.print("empty root: "); single.levelOrder(); System.out.println();
    }
}
