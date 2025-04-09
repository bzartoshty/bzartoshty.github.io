public class HeapSort<T extends Comparable<T>> {
  /** Heap sort method */
	 @SuppressWarnings("hiding")
	public  <T> void heapSort(T[] list) {
	    // Create a Heap of integers lambda expression
	    heapSort(list);
	  }
	  
	  /** Heap sort method */
	  public  <T extends Comparable<T>> void heapSort(T[] list) {
	    // Create a Heap of integers
		  MaxHeap<T> heap = new MaxHeap<>();

	    // Add elements to the heap
	    for (int i = 0; i < list.length; i++)
	      heap.add(list[i]);

	    // Remove elements from the heap
	    for (int i = list.length - 1; i >= 0; i--)
	      list[i] = heap.remove();
	  }

 /*  @SuppressWarnings("unchecked")
   public  void heapSort(T[] list) {
      int n = list.length;
      // build heap (rearrange array)
      for(int i = n-1;i >=0;--i)
         heapRebuild(list,i,n);
       // Do the heap sort         
      for(int i= n-1;i>=0;i--) {
         T temp = list[0];
         list[0] = list[i];
         list[i] = temp;
       for(int j = i-1; j>=0;--j)
         heapRebuild(list,j,i); 
        
      }
   
   }
   
   protected  void heapRebuild(T[] list, int i, int n) {
      // if the root is not a leaf and the root's search key
      // is less than the larger of the search keys in the 
      // root's children
      
      // index of root's left child, if any
      int root = i;
      int child = 2 * root + 1;  
      if (child < n ) {
         // root is not a leaf, so it has a left child
         // index of root's right child, if any
         int rightChild = child + 1;
         
         // if root has a right child, find larger child
         if (( rightChild < n) && 
              list[rightChild].compareTo(list[child]) > 0) {
            child = rightChild; // index of larger child
         }
         
         // if the root's value is smaller than the value in the larger
         // child, swap values
         if (list[root].compareTo(list[child]) < 0) {
            T temp = list[root];
            list[root]=list[child];
            list[child] = temp;
            // transform the new subtree into a heap
            heapRebuild(list, root, n);
         } // end if
      } // end if
      // if root is a leaf, do nothing
   } // end rebuild

*/
     }