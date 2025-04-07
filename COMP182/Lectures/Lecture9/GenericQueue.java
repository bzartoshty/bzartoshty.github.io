import java.util.*;


public class GenericQueue<E>  {
   private Object[] queue;
   private  int capacity = 8;
   private int front, back;
   private int size;
	
   public GenericQueue(){
      queue = new Object[capacity];
      front = size =0;
      back = capacity-1;
   	
   }
	
	
	
	/** Inserts the specified element into this queue if it is possible to do so immediately 
	 * without violating capacity restrictions (double the size of the queue +1) . 
	 */
   public boolean enqueue(E e) {
      ensureCapacity();
      back = (back+1) % capacity;
      queue[back] = e;
      size++;
      return true;
   }
	
	
	
	
   @SuppressWarnings("unchecked")
   /** Retrieves and removes the element at the head of this queue. 
    * it throws a NoSuchElementException if this queue is empty. */
   public E dequeue() {
      if (!isEmpty()) {
         E item = (E)queue[front];
         front = (front+1) % capacity;
         --size;
         return item;
      }
      throw new NoSuchElementException() ;
   		
   }
	
	/** Retrieves without removing  the element at the head of this queue. 
	 * it throws a NoSuchElementException if this queue is empty. */
   @SuppressWarnings("unchecked")
   public E peek() {
      if (!isEmpty()) {
         return (E)queue[front];
      	
      }
      throw new NoSuchElementException() ;
   }
	
	/** if this queue is empty return true, otherwise return false */
   public boolean isEmpty() {
      return size==0;
   }
	
	/** return number of elements in this queue */
   public int getSize() {
      return size;
   }
	
	/** Return a list representation of this queue */
   public String toString() {
      ArrayList<Object> list = new ArrayList<>();
      for(int i=front;i<=back;++i) {
         list.add(queue[i]);
      }
      return list.toString();
   }
	
	/** A utility method to ensure that this queue is not full. 
	 * If this queue is full, double the capacity (capacity * 2 +1 )
	 */
   private void ensureCapacity() {
      if(size==capacity) {
         capacity = capacity * 2 + 1;
      	
      	
         queue = Arrays.copyOf(queue, capacity);
      	
      }
   }
}
