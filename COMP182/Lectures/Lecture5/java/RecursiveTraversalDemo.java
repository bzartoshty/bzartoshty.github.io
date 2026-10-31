public class RecursiveTraversalDemo {
    static <E> void forward(Node<E> n) {
        if (n == null) return;
        System.out.println(n.element);
        forward(n.next);
    }
    static <E> void backward(Node<E> n) {
        if (n == null) return;
        backward(n.next);
        System.out.println(n.element);
    }
    public static void main(String[] args) {
        Node<String> head = new Node<>("A");
        head.next = new Node<>("B"); head.next.next = new Node<>("C");
        System.out.println("forward:"); forward(head); // A B C on separate lines
        System.out.println("backward:"); backward(head); // C B A on separate lines
        // Both methods use O(n) call-stack space. Use iteration for very long lists.
    }
}
