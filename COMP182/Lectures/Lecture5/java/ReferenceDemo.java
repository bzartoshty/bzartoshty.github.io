public class ReferenceDemo {
    static <E> void advance(Node<E> node) { node = node.next; }
    static <E> void skipNext(Node<E> node) { node.next = node.next.next; }
    public static void main(String[] args) {
        Node<String> p = new Node<>("A");
        Node<String> q = p;
        q.element = "B";
        p = null;
        System.out.println(q.element); // B: same mutable object
        System.out.println(q.next == null); // true

        Node<String> head = new Node<>("A");
        head.next = new Node<>("B");
        head.next.next = new Node<>("C");
        advance(head); // Reassigns only the parameter.
        System.out.println(head.element); // A
        skipNext(head); // Mutates a shared node.
        System.out.println(head.next.element); // C
        Node<String> sameValue = new Node<>("A");
        System.out.println(head == sameValue); // false
        System.out.println(head.equals(sameValue)); // false: no override
        System.out.println(head.element.equals(sameValue.element)); // true
    }
}
