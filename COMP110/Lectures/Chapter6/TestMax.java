import java.util.*;
public class TestMax {
  /** Main method */
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      // variables are allocated on memory stack
      // stack is a data structure called LIFO (last-in, first-out)
      System.out.print("Enter four int values: ");
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int n4 = in.nextInt();
     
      double max = max(max(n1,n2),max(n3,n4));
            System.out.println("The maximum is " + max);
    
   }

  /** Return the max between two integernumbers */
   public static int max(int num1, int num2) {
      int result;
   
      if (num1 >= num2)
         result = num1;
      else 
         result = num2;
   
      return result; // Return result
   }
   
   public static int sum(int i1, int i2) {
    int sum = 0;
    for(int i=i1;i<=i2;++i){
     sum += i;
    }
    return sum;
  }
   
  
}