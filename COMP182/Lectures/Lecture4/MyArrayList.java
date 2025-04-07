import java.util.*;

public class MyArrayList<E> implements MyList<E> {
   private E[] list;
   private int size=0;
   private int capacity=10;
	
   @SuppressWarnings("unchecked")
   public MyArrayList() {
      size = 0;
      list = (E[])(new Object[capacity]);
   }
	
   @SuppressWarnings("unchecked")
   public MyArrayList(int initialCapacity) {
      size = 0;
      capacity = initialCapacity;
      list = (E[])(new Object[capacity]);
   }
	
   @SuppressWarnings("unchecked")
   public MyArrayList(Collection<E> c) {
   	// TODO Auto-generated method stub
   
   }
	
   @Override
   public boolean add(E e) {
   	// TODO Auto-generated method stub
   
      return true;
   }
	
   // throws IndexOutOfBoundExcption 
   private void checkIndex(int index) {
      if(index<0 || index >=size)
         throw new IndexOutOfBoundsException("Index "+index +" out of bound for length "+size);
   }
			
	
   @Override
   public void add(int index, E element) {
   	// TODO Auto-generated method stub
   
   }
	
	
   public boolean addAll(Collection<? extends E> c) {
   // TODO Auto-generated method stub
   
      return true;
   }
	
   public void clear() {
   }
	
   public String toString() {
      if(size==0)
         return "[]";
      @SuppressWarnings("unchecked")
         E[] temp = (E[])(new Object[size]);
      System.arraycopy(list, 0, temp, 0, size);
      return Arrays.asList(temp).toString();
   }
	
   @SuppressWarnings({ "unchecked", "unchecked" })
   public boolean contains(Object o) {
   // TODO Auto-generated method stub
   
      return false;
   }
	
   public E get(int index) {
   // TODO Auto-generated method stub
   
      return null;
   	
   }
	
   @SuppressWarnings("unchecked")
   public int indexOf(Object o) {
   // TODO Auto-generated method stub
   
      return -1;
   }
	
   @Override
   public boolean isEmpty() {
   // TODO Auto-generated method stub
   
      return true;
   }
	
   @SuppressWarnings("unchecked")
   public int lastIndexOf(Object o) {
   // TODO Auto-generated method stub
   
      return -1;
   }
	
   @Override
   public E remove(int index) {
   // TODO Auto-generated method stub
   
      return null;
   }
	
   @Override
   public  boolean remove(Object o) {
   // TODO Auto-generated method stub
   
      return false;
   }
	
	
   public E set(int index, E element) {
   // TODO Auto-generated method stub
   
      return null;
   }
	
   @Override
   public int size() {
      return size;
   }
	
   public void trimToSize() {
   // TODO Auto-generated method stub
   
   }
	
	
   private void ensureCapacity() {
   // TODO Auto-generated method stub
   
   }

   @Override
   public Object[] toArray() {
   	// TODO Auto-generated method stub
      return null;
   }

	/** Returns an array containing all of the elements in this collection; 
     * the runtime type of the returned array is that of the specified array.
     */
	
   @SuppressWarnings("unchecked")
   public  <E> E[] toArray(E[] array) {
   // TODO Auto-generated method stub
   
      return null;
   }

   @Override
   public boolean containsAll(Collection<?> c) {
   // TODO Auto-generated method stub
   
      return true;
   }

   @Override
   public boolean removeAll(Collection<?> c) {
   	// TODO Auto-generated method stub
      return true;
   }

   @Override
   public boolean retainAll(Collection<?> c) {
   	// TODO Auto-generated method stub
      return true;
   }
	
   @Override /** Override iterator() defined in Iterable */
     public java.util.Iterator<E> iterator() {
      return new ArrayListIterator();
   }
	 
   private class ArrayListIterator 
         implements java.util.Iterator<E> {
      private int current = 0; // Current index 
   
      @Override
       public boolean hasNext() {
         return current < size;
      }
   
      @Override
       public E next() {
         return (E)list[current++];
      }
   
      @Override // Remove the element returned by the last next()
       public void remove() {
         if (current == 0) // next() has not been called yet
            throw new IllegalStateException(); 
         MyArrayList.this.remove(--current);
      }
   }
	  
	 
}
