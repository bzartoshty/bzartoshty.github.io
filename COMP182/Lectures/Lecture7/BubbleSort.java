public class BubbleSort {
  /** The method for sorting the numbers */
  public static void bubbleSort(int[] list) {

	    boolean needNextPass = true;
		for(int k=1;k<list.length ;++k) {
			needNextPass = false;
			for(int i=0;i<list.length-k;++i) {
				if(list[i] > (list[i+1]) ) {
					int temp = list[i];
					list[i]=list[i+1];
					list[i+1]=temp; 
				needNextPass = true;
					
				}
			}
		}
	} // end bubbleSort
  
       
  public static void main(String[] args) {
    int[] list = {-2, 4, 5, 1, 2, -3};
    bubbleSort(list);
    for (int i = 0; i < list.length; i++)
      System.out.print(list[i] + " ");
  }
}