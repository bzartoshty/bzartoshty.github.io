import java.util.*;
public class MaxRational {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      Random rand = new Random(10);
      System.out.print("Enter number of rational numbers: ");
      int n=in.nextInt();
      // Create the array of n rational numbers
      Rational[] list = new Rational[n];
      generateRationals(list);
      // Print the Rational numbers n perline
      printRationals(list,5);
      System.out.println();
      // find the maximun
      Rational max = findMax(list);
      System.out.print("The largest Rational number is: "+max);
   }
      
   public static void generateRationals(Rational[] list) {
      Random rand = new Random(10);
      for(int i=0;i<list.length;++i) {
         list[i] = new Rational(1+rand.nextInt(20),1+rand.nextInt(20));
      }
   }
   
   public static void printRationals(Rational[] list, int n) {
      for(int i=0;i<list.length;++i) {
         if((i+1)%n==0)
            System.out.println(list[i]);
         else
            System.out.print(list[i]+" ");
      }
   }
   
   public static Rational findMax(Rational[] list) {
      Rational max = list[0];
      for(int i=1;i<list.length;++i) {
         if(max.compareTo(list[i]) < 0)
            max = list[i];
      }
      return max;
   }
   
            
}

   
