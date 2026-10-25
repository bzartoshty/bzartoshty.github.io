import java.util.*;
public class IteratorDemo {
    public static void main(String[] args) {
        BST<Integer> tree = TraversalDemo.example();
        Iterator<Integer> it = tree.iterator();
        while (it.hasNext()) System.out.print(it.next() + " ");
        System.out.println();
        try { it.next(); } catch (NoSuchElementException e) {
            System.out.println("exhausted: NoSuchElementException");
        }
        it = tree.iterator(); tree.insert(80);
        try { it.next(); } catch (ConcurrentModificationException e) {
            System.out.println("structural change detected");
        }
    }
}
