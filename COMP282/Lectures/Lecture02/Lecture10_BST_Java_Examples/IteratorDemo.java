import java.util.*;
public class IteratorDemo {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = TraversalDemo.example();
        Iterator<Integer> it = tree.iterator();
        while (it.hasNext()) System.out.print(it.next() + " ");
        System.out.println();
        try { it.next(); } catch (NoSuchElementException e) {
            System.out.println("exhausted: NoSuchElementException");
        }
        it = tree.iterator(); tree.insert(80);
        System.out.println("snapshot next after inserting 80: " + it.next());
        // This implementation takes an inorder snapshot when the iterator is created.
        // The existing iterator does not include the newly inserted key 80.
    }
}
