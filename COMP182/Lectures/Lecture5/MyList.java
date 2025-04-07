
public interface MyList<E>  {
  
   
  /** Remove the element at the specified position in this list
   *  Shift any subsequent elements to the left.
   *  Return the element that was removed from the list. */
  public E remove(int index);
  
  /** Remove the element at the beginning of this this list 
   *  Return the element that was removed */
  public E removeFirst();
  
  /** Remove the element at the end of this this list 
   *  Return the element that was removed */
  public E removeLast();
  
  /** Add a new element at the specified position*/
  public void add(int index, E e);
   
  /** Add a new element at the end of this list */
  public  void addLast(E e);
    
  /** Add a new element at the beginning of this list */
  public  void addFirst(E e);
 
  /** Return true if this list contains no elements */
  public  boolean isEmpty();

      
  /** Return size of this list */
  public int size();
  
 
}
