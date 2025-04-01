import java.util.*;
public class TestLogicalOperators {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      if(num % 2 == 0 && num % 3 == 0) {
         System.out.println(num+" is divisible by 2 and 3");
      }
      if(num % 2 == 0 || num % 3 == 0) {
         System.out.println(num+" is divisible by 2 or 3");
      }
      if(num % 2 == 0 ^ num % 3 == 0) {
         System.out.println(num+" is divisible by 2 or 3 not both");
      }
      
        
      
   }
}