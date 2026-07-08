import java.util.*;

public interface MyList<E> extends Collection<E>{


    /** Add a new element at the specified position*/
    public boolean add(E e);

    /** Inserts the specified element at the specified position in this list. */
    public void add(int index, E element);

    /** Appends all of the elements in the specified collection to the end of this list,
     * in the order that they are returned by the specified collection's iterator.
     */
    public boolean addAll(Collection<? extends E> c);

    /** Inserts all of the elements in the specified collection into this list at the specified position. */
    public boolean addAll(int index, Collection<? extends E> c);

    /** Removes all of the elements from this list */
    public void clear();

    /** Returns true if this list contains the specified element. */
    public boolean contains(Object o);

    /** Returns true if this list contains all of the elements of the specified collection. */
    public boolean containsAll(Collection<?> c);

    /** Compares the specified object with this list for equality */
    public boolean equals(Object o);

    /** Returns the element from this list at the specified index
     * Throw exception if index out of range
     */
    public E get(int index);


    /** Returns the index of the first matching element in this list */
    public int indexOf(Object o);

    /** Returns true if this list is empty */
    public boolean isEmpty();

    /** Returns an iterator over the elements in
     * this list in proper sequence.
     */
    public Iterator<E> iterator();


    /** Returns the index of the last matching element in this list. */
    public int lastIndexOf(Object o);

    /** Remove the element at the specified position in this list
     *  Return the element that was removed from the list.
     *  Throw exception if index out of range
     */
    public E remove(int index);


    /** Removes the first occurrence of the
     * specified element from this list,
     * if it is present
     */
    public boolean remove(Object o);

    /** Removes from this list all of its elements
     * that are contained in the specified collection.
     */
    public boolean removeAll(Collection<?> c);

    /** Retains only the elements in this list
     * that are contained in the specified collection.
     */
    public boolean retainAll(Collection<?> c);


    /** Replace element at given index with new element
     * Throw exception if index out of range
     */
    public E set(int index, E element);


    /** Return size of this list */
    public int size();

    /** Sorts this list in ascending order. */
    public void sort();

    /** Returns a view of the portion of this list
     * between the specified fromIndex,
     * inclusive, and toIndex, exclusive.
     */
    public MyList<E> subList(int fromIndex, int toIndex);

    /** Returns an array containing all of the
     * elements in this list in proper sequence
     * (from first to last element).
     */
    public Object[] toArray();

    /** Returns an array containing all of the
     * elements in this list in proper sequence
     * (from first to last element);
     */
    public <T> T[] toArray(T[] a);

    /** Return a deep copy of this list */
    public MyList<E> clone();


    /** Add all the elements in collection c into this list
     * in ascending order.
     */
    public void addAllInOrder(Collection<? extends E> c);



    /** Split the original list in half. The original
     * list will continue to reference the front half of the original list and the method
     * returns a reference to a new list that stores the back half of the original list.
     * If the number of elements is odd, the extra element should remain with the front half of the list.
     */
    public MyList<E> split();


}
