public class HeapSortTest {
/** A test method */
  public static void main(String[] args) {
    HeapSort<Integer> hs = new HeapSort<>();
    Integer[] list = {6,3,5,9,2,10}; 
    hs.heapSort(list);
    for (int i = 0; i < list.length; i++)
      System.out.print(list[i] + " ");
  }
}