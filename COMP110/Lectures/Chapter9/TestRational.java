import java.util.*;
public class TestRational {
   public static void main(String[] args) {
    // create a Rational array of 5 random Raional numbers
      Random rnd = new Random();
      Rational[] list = new Rational[5];
      for(int i=0;i<list.length;++i){
         list[i] = new Rational(1+rnd.nextInt(20),1+rnd.nextInt(20));
      }
      // Print the largest value
      System.out.println(max(list));
      // sort the list using selection sort
      selectinSort(list);
      // use binarySerach to locate a value
      Rational r = new Rational(1+rnd.nextInt(20),1+rnd.nextInt(20));
         System.out.println(binarySearch(list,r));
    
   }
   
   public static Rational max(Rational[] list) {
    Rational max = list[0];
    for(int i=1;i<list.length;++i){
     if(list[i].compareTo(max) > 0)
      max = list[i];
    }
    return max;
   }
   
   public static void selectinSort(Rational[] list){
    for(int i=0;i<list.length;++i) {
         Rational min = list[i];
         int index = i;
         for(int j=i+1;j<list.length;++j){
            if(list[j].compareTo(min)<0) {
               min = list[j];
               index = j;
            }
         }
         if(i!=index) {
            list[index]=list[i];
            list[i]=min;
         }
      }

   }
   
   public static int binarySearch(Rational[] list, Rational key) {
   int low = 0, high = list.length-1;
      while(high>=low) {
         int mid =(low+high)/2;
         if(key==list[mid])
            return mid;
         else if(key.compareTo(list[mid])<0)
            high = mid-1;
         else
            low = mid+1;
      }

   return -1;
   }
}