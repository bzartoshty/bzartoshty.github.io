public class ArrayCopy {
   public static void main(String[] args) {
      int x=10;
      int y=20;
      x=y;
      y=5;
      int[] list1 = {1,5,6,4,7,10};
      int[] list2 = {5,12,3,45,6,11};
      System.arraycopy(list1,0,list2,0,2);
      list1[0]=5;    
         
   }
}