public class HeapSortTest {
/** A test method */
  public static void main(String[] args) {
    HeapSort2<Integer> hs = new HeapSort2<>();
    Integer[] list = {6,3,5,9,2,10}; 
    hs.heapSort2(list);
    for (int i = 0; i < list.length; i++)
      System.out.print(list[i] + " ");
  }
}