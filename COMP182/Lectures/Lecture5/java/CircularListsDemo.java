/** Bounded traversals of circular singly and doubly linked lists. */
public class CircularListsDemo {
    private static final class DNode {
        String element;
        DNode next, previous;
        DNode(String e) { element = e; }
    }
    static <E> void printCircular(Node<E> head) {
        if (head == null) { System.out.println("[]"); return; }
        Node<E> current = head;
        do {
            System.out.print(current.element + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
    public static void main(String[] args) {
        Node<String> a = new Node<>("A"), b = new Node<>("B"), c = new Node<>("C");
        a.next = b; b.next = c; c.next = a;
        printCircular(a); // A B C
        Node<String> one = new Node<>("only"); one.next = one;
        printCircular(one); // only
        printCircular(null); // []
        DNode x = new DNode("X"), y = new DNode("Y"), z = new DNode("Z");
        x.next = y; y.next = z; z.next = x;
        x.previous = z; z.previous = y; y.previous = x;
        DNode current = z;
        do {
            System.out.print(current.element + " ");
            current = current.previous;
        } while (current != z);
        System.out.println(); // Z Y X
    }
}
