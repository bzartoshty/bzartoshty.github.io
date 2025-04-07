import java.util.*;
public class PriorityQueue<T extends Comparable<T>> {
    private Heap<T> pq;
    
    public PriorityQueue() {
        pq = new Heap<>();
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
    
    public String toString() {
        return pq.toString();
    }
    
}

