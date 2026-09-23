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
        if(index < 0 || index >= size){
            return null;
        }
        else if(index == 0){
            return removeFirst();
        }
        else if(index == size-1){
            return removeLast();
        }
        else {
            Node<E> prev = head;
            for(int i = 1; i < index; i++){
                prev = prev.next;
            }
            Node<E> curr = prev.next;
            prev.next = curr.next;
            size--;
            return curr.element;
        }
    }

    /** Remove the element at the beginning of this this list
     *  Return the element that was removed */
    public E removeFirst() {
        if(size == 0) {
            return null;
        }
        else {
            E ret = head.element;
            head = head.next;
            size--;
            if (head == null) {
                tail = null;
            }
            return ret;
        }
    }

    /** Remove the element at the end of this this list
     *  Return the element that was removed */


    /** Add a new element at the specified position*/
    public void add(int index, E e) {
        if(index == 0){
            addFirst(e);
        }
        else if(index == size){
            addLast(e);
        }
        else {
            Node<E> curr = head;
            for(int i = 1; i < index; i++){
                curr = curr.next;
            }
            Node<E> newNode = new Node<>(e);
            Node<E> temp = curr.next;
            curr.next = newNode;
            newNode.next = temp;
            size++;
        }

    }

    public E removeLast(){
        if(size == 0) {
            return null;
        }
        else if(size==1){
            return removeFirst();
        }
        else {
            Node<E> temp = head;
            while(temp.next != tail){
                temp = temp.next;
            }
            E ret = tail.element;
            tail = temp;
            tail.next = null;
            size--;
            return ret;
        }

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

