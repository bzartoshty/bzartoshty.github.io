import java.util.*;
public class TestArray {
   public static void main(String[] args) {
      Random rand = new Random();
      int num =10;
      int[] list = new int[10];
      for(int i=0;i<=list.length;i++) {
         list[i] = rand.nextInt(20);
      }
      printList(list);
      int[] list1 = doubleTheValues(list);
      System.out.println(linearSearch(list,8));
   }
   
     
   public static void printList(int[] list) {
      for(int num:list) {
         System.out.print(num+" ");
      }
   }
   
   public static int[] doubleTheValues(int[] list) {
    int[] temp = new int[list.length];
    for(int i=0;i<list.length;++i) {
     temp[i] = list[i]*2;
    }
    return temp;
   }
   
   public static int linearSearch(int[] list, int key) {
    for(int i=0;i<list.length;i++) {
     if(list[i] == key)
      return i;
    }
    return -1;
   }
}
