import java.util.*;
import java.util.Iterator;


public class MyLinkedList<E extends Comparable<E>> implements MyList<E>  {
    private Node<E> head, tail;
    private int size = 0; // Number of elements in the list

    public MyLinkedList() {
        head = tail = null;
        size = 0;
    }

    /** Create a list from an array of objects */
    public MyLinkedList(E[] objects) {
        // Left as Exercise
        for (int i = 0; i < objects.length; i++)
            add(objects[i]);
    }

    /** Return the head element in the list */
    public E getFirst() {
        if (size == 0) {
            return null;
        } else {
            return head.element;
        }
    }

    /** Return the last element in the list */
    public E getLast() {
        if (size == 0) {
            return null;
        } else {
            return tail.element;
        }
    }

    /** Add an element to the beginning of the list */
    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e); // Create a new node
        newNode.next = head; // link the new node with the head
        head = newNode; // head points to the new node
        size++; // Increase list size

        if (tail == null) // the new node is the only node in list
            tail = head;
    }

    /** Add an element to the end of the list */
    @Override
    public boolean add(E e) {
        // TODO Auto-generated method stub
        Node<E> newNode = new Node<>(e); // Create a new for element e

        if (tail == null) {
            head = tail = newNode; // The new node is the only node in list
        } else {
            tail.next = newNode; // Link the new with the last node
            tail = newNode; // tail now points to the last node
        }

        size++; // Increase size
        return true;
    }

    public void add(int index, E e) {
        if (index == 0) {
            addFirst(e);
        } else if (index >= size) {
            add(e);
        } else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<>(e);
            (current.next).next = temp;
            size++;
        }
    }

    /** add element value after element @ index */
    public void addAfter(int index, E value) {
        Node<E> curr = head;

        for (int i = 0; i < index; i++)
            curr = curr.next;

        Node<E> next = curr.next;
        Node<E> newNode = new Node<>(value); // Create a new for element e
        curr.next = newNode;
        newNode.next = next;
        size++;
    }

    /** Add a new element at the specified index in this list in ascending order */
    public void addInOrder(E e) {
        // Left as Exercise
        if (this.isEmpty())
            this.addFirst(e);
        else {
            Node<E> current = head;
            Node<E> prev = null;
            while (current != null && current.element.compareTo(e) <= 0) {
                prev = current;
                current = current.next;
            }
            Node<E> temp = new Node<>(e);
            if (current == null) {
                this.add(e);
            } else if (current == head) {
                this.addFirst(e);
            } else {
                prev.next = temp;
                temp.next = current;
                size++;
            }
        }

    }

    /** check to see if two given lists are identical */
    public boolean equals(Object o) {
        @SuppressWarnings("unchecked")
        MyLinkedList<E> otherList = (MyLinkedList<E>) o;

        if (otherList.size() != this.size()) {
            return false;
        } else {
            Node<E> tempNode = this.head;
            Node tempNodeOther = otherList.head;
            while (tempNode != null || tempNodeOther != null) {
                if (!tempNode.element.equals(tempNodeOther.element)) {
                    return false;
                } else {
                    tempNode = tempNode.next;
                    tempNodeOther = tempNodeOther.next;
                }
            }
            return true;
        }

    }

    /** Make deep copy of this list */
    public MyLinkedList<E> clone() {
        MyLinkedList<E> clone = new MyLinkedList<>();

        for (Node<E> curr = head; curr != null; curr = curr.next)
            clone.add(curr.element);

        return clone;
    }

    /*
     * This method removes from the linked list the first appearance of the value
     * received as //parameter/argument, and it returns true if it finds and removes
     * the value or returns false //if the linked list does not have the value.
     * public int lastIndex(E value) { int storeIndex = -1; Node currentNode = head;
     * for (int i = 0; i < size; i++){ if (currentNode.element.equals(value)){
     * storeIndex = i; } currentNode = currentNode.next; } return storeIndex; }
     */
    /**
     * Remove the head node and return the object that is contained in the removed
     * node.
     */
    public E removeFirst() {
        if (size == 0) {
            return null;
        } else {
            E temp = head.element;
            head = head.next;
            size--;
            if (head == null) {
                tail = null;
            }
            return temp;
        }
    }

    /**
     * Remove the last node and return the object that is contained in the removed
     * node.
     */
    public E removeLast() {
        if (size == 0) {
            return null;
        } else if (size == 1) {
            E temp = head.element;
            head = tail = null;
            size = 0;
            return temp;
        } else {
            Node<E> current = head;

            for (int i = 0; i < size - 2; i++) {
                current = current.next;
            }

            E temp = tail.element;
            tail = current;
            tail.next = null;
            size--;
            return temp;
        }
    }

    /**
     * Remove the element at the specified position in this list. Return the element
     * that was removed from the list.
     */
    public E remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        } else if (index == 0) {
            return removeFirst();
        } else if (index == size - 1) {
            return removeLast();
        } else {
            Node<E> previous = head;

            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }

            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }

    /** Check to see if this list contains element e */
    public boolean contains(E e) {
        // Left as Exercise
        for (Node<E> current = head; current != null; current = current.next) {
            if (current.element.equals(e))
                return true;
        }
        return false;
    }

    /**
     * Remove all the occurrences of the element e from this list. Return true if
     * the element is removed.
     */
    public boolean removeAll(E e) {
        // Left as Exercise
        int size = this.size;
        int i = 0;
        for (Node<E> current = head; current != null; current = current.next) {
            if (current.element.equals(e)) {
                remove(i);
                i--;
            }
            i++;
        }
        if (this.size == size)
            return false;
        else
            return true;
    }

    /**
     * Remove the first occurrence of the element e from this list. Return true if
     * the element is removed.
     */
    public boolean removeElement(E e) {
        // Left as Exercise
        int i = 0;
        for (Node<E> current = head; current != null; current = current.next) {
            if (current.element.equals(e)) {
                remove(i);
                return true;
            }
            i++;
        }
        return false;
    }

    /** Return the length of this list using recursion */
    public int getLength() {
        // Left as Exercise
        return getLength(head);
    }

    public int getLength(Node<E> curr) {
        if (curr == null)
            return 0;
        else
            return 1 + getLength(curr.next);
    }

    /** Override toString() to return elements in the list in [] separated by , */
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            result.append(current.element);
            current = current.next;
            if (current != null) {
                result.append(", "); // Separate two elements with a comma
            } else {
                result.append("]"); // Insert the closing ] in the string
            }
        }

        return result.toString();
    }

    /** Clear the list */
    public void clear() {
        size = 0;
        head = tail = null;
    }

    /**
     * Return the element at the specified index. Return null if index not in range
     */
    public E get(int index) {
        // Left as an exercise
        if (index < 0 || index >= size)
            return null;
        Node<E> current = head;
        for (int i = 0; i < index; ++i)
            current = current.next;
        return current.element;
    }

    /**
     * Return the index of the head matching element in this list. Return -1 if no
     * match.
     */
    public int indexOf(Object e) {
        // Left as an exercise
        Node<E> current = head;
        int index = 0;
        while (current != null) {
            if (current.element.equals(e)) {
                return index;
            }
            index++;
            current = current.next;
        }

        return -1;
    }

    /**
     * Replace the element at the specified position in this list with the specified
     * element and return the old element that was over written
     */
    public E set(int index, E e) {
        // Left as an exercise
        if (index < 0 || index >= size)
            return null;
        Node<E> current = head;
        for (int i = 0; i < index; ++i)
            current = current.next;
        E temp = current.element;
        current.element = e;
        return temp;

    }

    /** Print this list in reverse using recursion */
    public void printListBackWard() {
        // Left as Exercise
        printListBackWard(this.head);
        System.out.println();
    }

    private void printListBackWard(Node<E> nextNode) {
        if (nextNode.next == null) {
            System.out.print(nextNode.element + " ");
        } else {
            printListBackWard(nextNode.next);
            System.out.print(nextNode.element + " ");
        }
    }

    /** Return the number of elements in this list */
    public int size() {
        return size(head);
    }

    private int size(Node<E> current) {
        if(current==null)
            return 0;
        else
            return 1 + size(current.next);

    }

    /** Return true if this list contains no elements */
    public boolean isEmpty() {
        return size == 0;
    }

    @SuppressWarnings("unchecked")

    /**
     * Returns an array containing all of the elements in this collection; the
     * runtime type of the returned array is that of the specified array.
     */
    public <E> E[] toArray(E[] array) {
        for (int i = 0; i < this.size(); i++)
            array[i] = (E) (this.get(i));
        if (size() > 0)
            return array;
        else
            return null;
    }

    /**
     * Split the original list in half. The original list will continue to reference
     * the front half of the original list and the method returns a reference to a
     * new list that stores the back half of the original list. If the number of
     * elements is odd, the extra element should remain with the front half of the
     * list.
     */
    public MyLinkedList<E> split() {
        MyLinkedList<E> temp = new MyLinkedList<>();

        int length = (int) Math.ceil(this.size / 2.0);
        for (int i = length; i < this.size(); ++i) {
            temp.add(this.get(i));
            this.remove(i);
            i--;
        }
        return temp;

    }

    public boolean removeAll(MyLinkedList<E> list) {
        boolean modified = false;
        for (Node<E> current = list.head; current != null; current = current.next) {
            // if(this.contains(current.element)) {
            int i = 0;
            for (Node<E> curr = this.head; curr != null; curr = curr.next) {
                if (curr.element.equals(current.element)) {
                    this.remove(i);
                    i--;
                    modified = true;
                }
                i++;
            }
        }
        // }
        return modified;
    }

    @Override
    public boolean contains(Object o) {
        // TODO Auto-generated method stub
        Node<E> current = head;
        while (current != null) {
            if (current.element.equals(o))
                return true;
            current = current.next;
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        // TODO Auto-generated method stub
        Object[] temp = new Object[this.size()];
        for (int i = 0; i < this.size(); i++)
            temp[i] = (E) (this.get(i));
        return temp;

    }

    @Override
    public boolean remove(Object o) {
        // TODO Auto-generated method stub
        int i = 0;
        for (Node<E> current = head; current != null; current = current.next) {
            if (current.element.equals(o)) {
                remove(i);
                return true;
            }
            i++;
        }
        return false;

    }

    @Override
    public boolean containsAll(Collection<?> c) {
        // TODO Auto-generated method stub
        @SuppressWarnings("unchecked")
        MyLinkedList<E> current = (MyLinkedList<E>) c;
        Iterator<E> it = current.iterator();
        while (it.hasNext()) {
            if (!this.contains(it.next()))
                return false;
        }
        return true;

    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        // TODO Auto-generated method stub
        @SuppressWarnings("unchecked")
        MyLinkedList<E> current = (MyLinkedList<E>) c;
        Iterator<E> it = current.iterator();
        while (it.hasNext()) {
            this.add(it.next());

        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        // TODO Auto-generated method stub
        @SuppressWarnings("unchecked")
        MyLinkedList<E> current = (MyLinkedList<E>) c;
        Iterator<E> it = current.iterator();
        E e;
        while (it.hasNext()) {
            e = it.next();
            if (this.contains(e))
                this.remove(e);
        }
        return true;

    }

    @Override
    public boolean retainAll(Collection<?> c) {
        // TODO Auto-generated method stub

        Iterator<E> it = this.iterator();
        E e;
        while (it.hasNext()) {
            e = it.next();
            if (!c.contains(e))
                this.remove(e);
        }
        return true;
    }

    /**
     * Return the index of the last matching element in this list. Return -1 if no
     * match.
     */
    @Override
    public int lastIndexOf(Object o) {
        // TODO Auto-generated method stub
        int storeIndex = -1;
        Node<E> currentNode = head;
        for (int i = 0; i < size; i++) {
            if (currentNode.element.equals(o)) {
                storeIndex = i;
            }
            currentNode = currentNode.next;
        }
        return storeIndex;

    }

    //Method to reverse the linked list
    public void reverse() {
        Node<E> prev = null;
        Node<E> current = head;
        Node<E> next = null;

        while (current != null) {
            next = current.next; // Store the next node
            current.next = prev; // Reverse the current node's pointer
            prev = current; // Move prev and current one step forward
            current = next;
        }
        tail = head;
        head = prev; // Update the head to the new front of the list

    }

    public void  reverseKGroup(int k) {
        if (this.isEmpty()  || k == 1) {
            return ;
        }
        //Node<E> temp  = this.head;
        Node<E> blank = new Node<>(null);
        blank.next = head;
        head = blank;
        Node<E> prev = head;
        Node<E> curr = this.head.next;
        int count = 0;
        while(curr !=  null) {
            count++;
            if(count % k == 0) {
                prev = reverse(prev, curr.next);
                curr = prev.next;
            }
            else {
                curr = curr.next;
            }

        }

        this.head = blank.next;
        while(tail.next !=null)
            tail = tail.next;
    }

    private Node<E> reverse(Node<E> prev, Node<E> next) {
        Node<E> last = prev.next;
        Node<E> curr = last.next;

        while (curr != next) {
            last.next = curr.next;
            curr.next = prev.next;
            prev.next = curr;
            curr = last.next;
        }

        return last;
    }

    public static<E extends Comparable<E>>  MyLinkedList<E> merge(MyLinkedList<E> l1 , MyLinkedList<E> l2) {
        MyLinkedList<E> l3 = new MyLinkedList<>();
        Node<E> c1 = l1.head;
        Node<E> c2 = l2.head;
        while(c1 != null && c2!=null) {
            if(c1.element.compareTo(c2.element)<0) {
                l3.add(c1.element);
                c1 = c1.next;
            }
            else {
                l3.add(c2.element);
                c2 = c2.next;
            }
        }
        while(c1 != null) {
            l3.add(c1.element);
            c1 = c1.next;
        }

        while(c2 != null) {
            l3.add(c2.element);
            c2 = c2.next;
        }
        return l3;
    }


    private static class Node<E extends Comparable<E>> {
        E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }

    @Override /** Override iterator() defined in Iterable */
    public java.util.Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements java.util.Iterator<E> {
        private Node<E> current = head; // Current index

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            E e = current.element;
            current = current.next;
            return e;
        }

        @Override // Remove the element returned by the last next()
        public void remove() {
            if (current == null) // next() has not been called yet
                throw new IllegalStateException();
            MyLinkedList.this.remove(current.element);
        }
    }

}