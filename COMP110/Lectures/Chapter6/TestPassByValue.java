// Given two int values, swap them
public class TestPassByValue {
   public static void main(String[] args){
      int num1 = 5;
      int num2 = 10;
      System.out.println("Before swap()");
      System.out.println("X is " + num1 + " and Y is " + num2);
      swap(num1,num2);
      System.out.println("After swap()");
      System.out.println("X is " + num1 + " and Y is " + num2);
   }
 
   public static void swap(int n1,int n2){
      int temp = n1;
      n1 = n2;
      n2= temp; 
   }
}
  
