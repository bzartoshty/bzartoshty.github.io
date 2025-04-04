import java.util.*;
public class FindMax {
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      Random rand = new Random(10);
      int n = input.nextInt();
      Rational[] list = new Rational[n];
      for(int i=0;i<n;++i) {
         // generate n & d between 10 & 20
         int num = 10+rand.nextInt(11);
         int den = 10+rand.nextInt(11);
         list[i] = new Rational(num,den);
      }
      Rational max = list[0];
      for(int i=1;i<n;++i){
         if(list[i].compareTo(max)>0)
            max=list[i];
      }
      System.out.println(max);
      selectionSort(list);
      for(int i=0;i<list.length;++i) {
       System.out.println(list[i]);
      }
   }
   
    public static void selectionSort(Rational[] list) {
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
}
  
   
 
