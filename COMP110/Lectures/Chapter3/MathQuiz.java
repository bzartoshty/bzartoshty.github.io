import java.util.*;
public class MathQuiz {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      
      //   1) Generate num1
      int num1 = (int)(Math.random()*10);
      //   2) Generate num2
      int num2 = (int)(Math.random()*10);
      // Swap if num1 < num2
      if (num1 < num2) {
         int temp = num1;
         num1 = num2;  
         num2 = temp;
      }  
      System.out.print( "what is "+ num1 + "-" + num2 +"?");
      int answer = in.nextInt();
      System.out.println(answer == num1-num2);
      
   }
}