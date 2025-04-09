import java.util.*;

public class TestPQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Random generator = new java.util.Random();

	      Integer smallData[]  = new Integer[10];
	      Integer mediumData[] = new Integer[20];
	      

			for (int i = 0; i < smallData.length; i++)
				smallData[i] = generator.nextInt(1000);

			for (int i = 0; i < mediumData.length; i++)
				mediumData[i] = generator.nextInt(100);

		   MaxPriorityQueue<Integer> smallPQ = new MaxPriorityQueue<>(smallData);
		
		   MaxPriorityQueue<Integer> mediumPQ = new MaxPriorityQueue<>(mediumData);
		   
		   System.out.println("Medium PQ: "+mediumPQ);
		   while(!mediumPQ.isEmpty())
			   System.out.print(mediumPQ.remove()+" ");
		   System.out.println();
		   System.out.println("small PQ: "+smallPQ);
		   while(!smallPQ.isEmpty())
			   System.out.print(smallPQ.remove()+" ");
		   System.out.println();
		   HeapSort<Integer> hs = new HeapSort<>();
		 
		   hs.heapSort(smallData);
		   System.out.println("Sorted list: "+Arrays.asList(smallData));
		   
		   
	}

}
