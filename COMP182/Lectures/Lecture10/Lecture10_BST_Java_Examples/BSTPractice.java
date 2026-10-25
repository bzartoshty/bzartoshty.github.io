public class BSTPractice {
    public static <E extends Comparable<? super E>> boolean valid(Node<E> x, E low, E high) {
        if (x == null) return true;
        if (x.key == null || (low != null && x.key.compareTo(low) <= 0)
                || (high != null && x.key.compareTo(high) >= 0)) return false;
        return valid(x.left, low, x.key) && valid(x.right, x.key, high);
    }
    public static void main(String[] args) {
        Node<Integer> root = new Node<>(12); root.left = new Node<>(5);
        root.left.right = new Node<>(15); // Parent check passes; ancestor bound fails.
        System.out.println("ancestor violation: " + valid(root,null,null));
        root.left.right.key = 10;
        System.out.println("corrected: " + valid(root,null,null));
    }
}
