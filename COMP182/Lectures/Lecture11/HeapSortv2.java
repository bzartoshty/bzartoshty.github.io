import java.util.Comparator;

public class HeapSortv2 {
  /** Heap sort method */
  @SuppressWarnings("unchecked")
  public static <T> void heapSort(T[] list) {
    // Create a Heap of integers lambda expression
    heapSort(list);
  }
  
  /** Heap sort method */
  public static <T extends Comparable<T>> void heapSort(T[] list) {
    // Create a Heap of integers
    Heap<T> heap = new Heap<>();

    // Add elements to the heap
    for (int i = 0; i < list.length; i++)
      heap.add(list[i]);

    // Remove elements from the heap
    for (int i = list.length - 1; i >= 0; i--)
      list[i] = heap.remove();
  }

  /** A test method */
  public static void main(String[] args) {
    Integer[] list = {-44, -5, -3, 3, 3, 1, -4, 0, 1, 2, 4, 5, 53}; 
    heapSort(list);
    for (int i = 0; i < list.length; i++)
      System.out.print(list[i] + " ");
  }
}