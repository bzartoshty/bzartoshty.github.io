public class DeletionDemo {
    public static void main(String[] args) {
        // One-child illustration omits 17, exactly as on slide 27.
        BST<Integer> one = new BST<>();
        for (int k : new int[]{12,5,15,2,9,20,7,10,30}) one.insert(k);
        one.delete(15); System.out.println("one child: " + one.levelOrderKeys());
        BST<Integer> two = TestBST.example();
        two.delete(12); System.out.println("two children: " + two.levelOrderKeys());
        two.delete(7); System.out.println("leaf: " + two.inorderKeys());
        System.out.println("absent: " + two.delete(999));
        System.out.println("size: " + two.size());
        BST<Integer> single = new BST<>(); single.insert(1); single.delete(1);
        System.out.println("empty root: " + single.levelOrderKeys());
    }
}
