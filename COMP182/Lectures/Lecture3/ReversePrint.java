import java.util.*;
public class ReversePrint {
   public static void main(String[] args) {
      WriteBackWard("Hello There");
   }
   
   // max method
   public static void  WriteBackWard(String s) {
      WriteBackWard(s,s.length()-1); 
     
   }

   public static void WriteBackWard(String s,int high){
    if(high==-1)
         return;
      else {
         System.out.print(s.charAt(high));
         WriteBackWard(s,high-1);
      }
       
   }
        
}
