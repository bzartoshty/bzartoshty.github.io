public class TestBST {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        BST<Integer> tree = new BST<>();
        tree.insert(50);
        tree.insert(30);
        tree.insert(80);

        tree.insert(20);
        tree.insert(40);
        tree.insert(65);
        tree.insert(90);
        tree.insert(60);
       

        for(Integer e : tree) {
            System.out.println(e);
        }


    }
}
