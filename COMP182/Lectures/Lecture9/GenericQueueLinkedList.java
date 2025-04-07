import java.util.*;
public class GenericQueueLinkedList<E> {
   private LinkedList<E> queue = new LinkedList<>();
   
   public void enqueue(E e){
      queue.addLast(e);
   }
   
   public E dequeue() {
      return queue.removeFirst();
   }
   
   public int size() {
      return queue.size();
   }
   
   public E peek() {
      return queue.getFirst();
   }
   
   public String toString() {
      return "QUEUE: " + queue.toString();
   }
}