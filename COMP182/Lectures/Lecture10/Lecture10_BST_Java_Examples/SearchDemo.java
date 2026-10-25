public class SearchDemo {
    public static void main(String[] args) {
        BST<Integer> tree = TestBST.example();
        for (int k : new int[]{10,8}) {
            System.out.println(k + " path: " + tree.searchPath(k));
            System.out.println("iterative: " + tree.contains(k));
            System.out.println("recursive: " + tree.containsRecursive(k));
        }
    }
}
