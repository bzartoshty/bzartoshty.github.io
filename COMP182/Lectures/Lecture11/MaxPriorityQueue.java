import java.util.*;
public class MaxPriorityQueue<T extends Comparable<T>> {
    private MaxHeap<T> pq;
    
    public MaxPriorityQueue() {
        pq = new MaxHeap<>();
    }
    
    public MaxPriorityQueue(T[] list) {
    	pq = new MaxHeap<>();
    	for(int i=0;i<list.length;i++)
    		pq.add(list[i]);
    }
    
        
    public boolean isEmpty() {
        return pq.isEmpty();
    }
    
    public void add(T newItem){
        pq.add(newItem);
    }
    
    public T remove() {
        return pq.remove();
    }
  
    

   
   public int size() {
	   return this.size();
   }
   
   public String toString() {
	   return pq.toString();
   }

    
}

