import java.util.*;
public class RadixSort implements Runnable{
	private int[] list;
	public RadixSort(int[] temp) {
		list=temp;
	}
	public void run() {
		ArrayList<Integer>[] buckets = new ArrayList[10];
		long startTime = System.nanoTime();
		// find the maximum value
		int max =list[0];
		for(int i=1;i<list.length;++i) {
			if(list[i]>max) max=list[i];
		}
		// find number of digits
		int cnt=Integer.toString(max).length();
	
		// start radix sort
		int exp = 1;
		for(int i=1;i<=cnt;++i) {
			for(int j=0;j<list.length;++j) {
				if(buckets[list[j]/exp%10]==null)
					buckets[(list[j]/exp)%10] = new ArrayList<>();
				buckets[(list[j]/exp)%10].add(list[j]);
			}
			exp=exp*10;
			int k=0; // index of list
			for(int j=0;j<buckets.length;++j) {
				if(buckets[j] != null) {
					while(buckets[j].size()!=0)
						list[k++]=buckets[j].remove(0);
				}
			}
		}
			
		long endTime = System.nanoTime();
		long executionTime = endTime - startTime;
		System.out.println("Radix Sort: " + executionTime);
		
		
	}
	

}
