public class MyLinkedList<E> implements MyList<E>{
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

    /** Add a new element at the beginning of this list */
    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;
        if(tail == null) {
            tail = newNode;
        }
    }

    /** Add a new element at the end of this list */
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
            System.out.print(curr.element+" ");
            printList(curr.next);

        }

    }

    public void printListReverse(){
        printListReverse(head);
    }

    private void printListReverse(Node<E> curr){
        if(curr == null){
            return;
        }
        else {
            printListReverse(curr.next);
            System.out.print(curr.element+" ");
        }
    }

    /** Remove the element at the specified position in this list
     *  Shift any subsequent elements to the left.
     *  Return the element that was removed from the list. */
    public E remove(int index) {
        return null;
    }

    /** Remove the element at the beginning of this this list
     *  Return the element that was removed */
    public E removeFirst() {
        return null;
    }

    /** Remove the element at the end of this this list
     *  Return the element that was removed */
    public E removeLast() {
        return null;
    }

    /** Add a new element at the specified position*/
    public void add(int index, E e) {

    }





    /** Return true if this list contains no elements */
    public  boolean isEmpty() {
        return size == 0;
    }


    /** Return size of this list */
    public int size() {
        return size;
    }
}

