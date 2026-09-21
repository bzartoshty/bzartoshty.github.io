public class MyLinkedList<E> {
    Node<E> head;
    Node<E> tail;
    int size;
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public MyLinkedList(E[] elements){
        for(int i = 0; i < elements.length; i++){
            this.addLast(elements[i]);
        }
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;
        if(tail == null) {
            tail = newNode;
        }
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);
        if(tail == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;

        }
        size++;
    }

    public void printList(){
       printList(head);
    }

    private void printList(Node<E> curr){
        if(curr == null){
            return;
        }
        else {

            printList(curr.next);
            System.out.print(curr.element+" ");
        }

    }
}
