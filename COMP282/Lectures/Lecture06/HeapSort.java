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
		  MinHeap<T> heap = new MinHeap<>();

	    // Add elements to the heap
	    for (int i = 0; i < list.length; i++)
	      heap.add(list[i]);

	    // Remove elements from the heap
	    for (int i =0; i < list.length; i++)
	      list[i] = heap.remove();
	  }

      }