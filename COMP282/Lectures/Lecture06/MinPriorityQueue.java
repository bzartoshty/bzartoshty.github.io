public class MinPriorityQueue<T extends Comparable<T>> {
    private MinHeap<T> pq;
    
    public MinPriorityQueue() {
        pq = new MinHeap<>();
    }
    
    public MinPriorityQueue(T[] list) {
    	pq = new MinHeap<>();
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


