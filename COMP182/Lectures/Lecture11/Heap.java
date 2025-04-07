import java.util.*;

public class Heap<T extends Comparable<T>> {
   private ArrayList<T> list;  // array of list items
//   protected java.util.Comparator<T> c; 
   
   @SuppressWarnings("unchecked")
   public Heap(){
      list = new ArrayList<>();
   }
   // Heap operations
   public boolean isEmpty() {
      // Check whether a heap is empty
      // Precondition: None
      // Postcondition: Returns true if the heap is empty
      // otherwise return false
      return list.isEmpty() ;
   }
   
   public void add(T newItem) {
      // adds an item into a heap
      // Precondition: newItem is the item to be added 
      // Postcondition: newItem is added in proper location in the heap
      
      // trickle new item up to its proper position
      list.add(newItem); // Append to the heap
      int currentIndex = list.size() - 1; // The index of the last node
      int parentIndex = (currentIndex - 1) / 2;
      while (currentIndex >= 0 && list.get(currentIndex).compareTo(list.get(parentIndex)) > 0 ) {
        
        // Swap list[currentIndex] and list[parentIndex]
        
         T temp = list.get(currentIndex);
         list.set(currentIndex, list.get(parentIndex));
         list.set(parentIndex, temp);
         currentIndex = parentIndex;
         parentIndex = (currentIndex - 1) / 2;
      } // end while
   
   
   } // end add
   
   public T remove() {
      // Retrieves and deletes the item in the root of a heap
      // Precondition: None
      // Postcondition: returns item at the root of the heap and deltes it, 
      // and rebuilds the heap. 
      // However, if the heap is empty, returns null
      T rootItem = null; 
      int loc;
      if (!isEmpty()) {
         rootItem = list.get(0); 
         loc = list.size()-1;
         // if we remove the item first, it may make the ArrayList list
         // empty, then set() won't work
         list.set(0,list.get(loc)); // replace the root with last node
         list.remove(loc); // remove the last node
         heapRebuild(0); // rebuild the heap from root to a heap
      } // end if
      return rootItem;
   } // end remove
   
   protected  void heapRebuild(int root) {
      // if the root is not a leaf and the root's search key
      // is less than the larger of the search keys in the 
      // root's children
      
      // index of root's left child, if any
      int child = 2 * root + 1;  
      if (child < list.size() ) {
         // root is not a leaf, so it has a left child
         // index of root's right child, if any
         int rightChild = child + 1;
         
         // if root has a right child, find larger child
         if (( rightChild < list.size()) && 
              list.get(rightChild).compareTo(list.get(child)) > 0) {
            child = rightChild; // index of larger child
         }
         
         // if the root's value is smaller than the value in the larger
         // child, swap values
         if (list.get(root).compareTo(list.get(child)) < 0) {
            T temp = list.get(root);
            list.set(root,list.get(child));
            list.set(child, temp);
            // transform the new subtree into a heap
            heapRebuild(child);
         } // end if
      } // end if
      // if root is a leaf, do nothing
   } // end rebuild
   
      
   public String toString() {
      // print the heap
      return list.toString();
   }
   
}


