import java.util.*;
public class ArrayExamples {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Random rnd = new Random(10);
      int[] list = new int[10];
      // initialize array with random values between 10 and 100
      for(int i=0;i<list.length;++i) {
         list[i] = 10+rnd.nextInt(91);
      }
      System.out.println(Arrays.toString(list));
      Arrays.sort(list);
      System.out.println(Arrays.toString(list));
      System.out.println(Arrays.binarySearch(list,102));


      /*
      // Printing an array
      for(int i=0;i<list.length;++i) {
         System.out.print(list[i] + "  ");
      }
      System.out.println();
      // sum all element
      int sum = 0;
      for(int i=0;i<list.length;++i) {
         sum = sum + list[i];
      }
      System.out.println("The sum of elements is "+sum);
      // Fiind the max and its index
      int max = list[0];
      int index = 0;
      for(int i=0;i<list.length;++i) {
         if(list[i]>max){
            max = list[i];
            index = i;
         }
      }
      System.out.println("The maximum is " + max + " at index " + index);
       // random shuffling
      for(int i=0;i<list.length;++i) {
         int j = rnd.nextInt(list.length);
         int temp = list[i];
         list[i] = list[j];
         list[j] = temp;
      }
       // Printing an array
      for(int i=0;i<list.length;++i) {
         System.out.print(list[i] + "  ");
      }
      System.out.println();
      // shift right
      int temp = list[list.length-1];
      for(int i=list.length-1;i>0;--i) {
         list[i] = list[i-1];
      }
      list[0] = temp;
      // shift left
      temp = list[0];
      for(int i=0;i<list.length-1;++i) {
         list[i] = list[i+1];
      }
      list[list.length-1] = temp;
      for(int num : list) {
         System.out.print(num+" ");
      }
      System.out.println();
      int[] list2 = new int[list.length];
      System.arraycopy(list,0,list2,0,list.length);
      for(int num : list2) {
         System.out.print(num+" ");
      }
      reverse(list);
      for(int num : list) {
         System.out.print(num+" ");
      }
      System.out.println();
   */
   }
   
   public static void reverse(int[] list) {
      for(int i=0,j=list.length-1;i<j;i++,j--) {
         int temp = list[i];
         list[i] = list[j];
         list[j] = temp;
      }
   
   }
}